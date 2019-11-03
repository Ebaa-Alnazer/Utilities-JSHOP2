package utilities.jshop2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Vector;


/*class MyInternalVars extends InternalVars {
    double resource;
}*/

/**
 * This class is the implementation of the JSHOP2 algorithm.
 *
 * @author Okhtay Ilghami
 * @author <a href="http://www.cs.umd.edu/~okhtay">http://www.cs.umd.edu/~okhtay</a>
 * @version 1.0.3
 */
public class MyJSHOP2 implements AlgorithmInterface {

    private static MyJSHOP2 instance;

    public static MyJSHOP2 getInstance() {
        if (instance == null)
            instance = new MyJSHOP2();

        return instance;
    }

    public void setAlgorithmArgs(double re, int risk) {
        riskAttitude = risk;
        resource = re;
    }

    private MyJSHOP2() {
    }

    /**
     * The plan currently being constructed.
     */
    private static Plan currentPlan;

    /**
     * The domain description for the planning problem.
     */
    private static Domain domain;

    /**
     * The maximum number of plans to be returned.
     */
    private static int planNo;

    /**
     * The plans are stored in this variable as a list of type
     * <code>Plan</code>.
     */
    private static LinkedList plans;

    /**
     * The current state of the world.
     */
    private static State state;

    /**
     * The task list to be achieved.
     */
    private static TaskList tasks;

    private static double resource;

    private static int riskAttitude;

    LinkedList<TaskAtom> primitivetasks;
    LinkedList<TaskAtom> compoundtasks;

    public void findUtilities() {
        //-- Get the current time.
        long t1 = new GregorianCalendar().getTimeInMillis();
        primitivetasks = new LinkedList<TaskAtom>();
        compoundtasks = new LinkedList<TaskAtom>();
        TaskAtom t;
        for (int d = 0; d < domain.methods.length; d++) {
            TaskAtom ta = new TaskAtom(domain.methods[d][0].getHead(), false, false);
            ta.setUtility(-1);
            ta.setCycle(false);
            compoundtasks.add(ta);
            for (int k = 0; k < domain.methods[d].length; k++) {
                for (int methodSubtasks = 0; methodSubtasks < domain.methods[d][k].getSubs()[0].subtasks.length; methodSubtasks++) {
                    domain.methods[d][k].setEstimationFactor(-1);
                    t = domain.methods[d][k].getSubs()[0].subtasks[methodSubtasks].getTask();
                    if (t.isPrimitive() && (!primitivetasks.contains(t) || primitivetasks.size() == 0)) {
                        LinkedList<Double> costs = new LinkedList<Double>();
                        for (int op = 0; op < domain.ops[t.getHead().getHead()].length; op++)
                            costs.add(domain.ops[t.getHead().getHead()][op].getCost(new Term[0]));
                        t.setUtility(computeEstimationFactor(costs, riskAttitude));
                        t.setCycle(false);
                        primitivetasks.add(t);
                    }
                }
            }
        }

        for (TaskAtom compoundtask : compoundtasks) {
            /////// Map<TaskAtom,Method> cycles= new HashMap<TaskAtom,Method>();
            LinkedList<TaskAtom> cycles = new LinkedList<>();
            //cycles.addLast(compoundtask);
            if (compoundtask.getUtility() == -1) {
                compoundtask.setUtility(findTaskUtility(compoundtask, cycles));
            }
        }
        //-- Get the current time again, to calculate the time used.
        long t2 = new GregorianCalendar().getTimeInMillis();

        try {
            BufferedWriter output;
            double preProcessingTime = (t2 - t1) / 1000.0;
            if (Factory.getInstance().isCSV()) {
                output = getBufferedWriter("results-uashop.csv");
                output.append(String.valueOf(preProcessingTime)).append(",");
            } else {
                output = getBufferedWriter("Result.txt");
                output.append("Time Used For Pre-processing= ")
                        .append(String.valueOf(preProcessingTime));
                output.newLine();
            }
            //Write Content
            // FileWriter writer = new FileWriter(file);

            output.close();
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }

    private BufferedWriter getBufferedWriter(String fileName) throws IOException {
        BufferedWriter output;
        File file;
        String outputFolder = Factory.getInstance().getOutputDirectory();
        if (outputFolder != null) {
            file = new File(outputFolder, fileName);
        } else {
            file = new File(fileName);
        }

        output = new BufferedWriter(new FileWriter(file, true));
        return output;
    }

    private double findTaskUtility(TaskAtom task, LinkedList<TaskAtom> cycles) {
        if (task.isPrimitive())
            return task.getUtility();
        else {
            LinkedList<Double> utilitiesOfTaskMethods = new LinkedList<>();
            if (!cycles.isEmpty() && cycles.contains(task)) {
                for (int indexOfTask = cycles.indexOf(task); indexOfTask < cycles.size(); indexOfTask++) {
                    TaskAtom nextTask;
                    if (indexOfTask == cycles.size() - 1)
                        nextTask = cycles.get(cycles.indexOf(task));
                    else
                        nextTask = cycles.get(indexOfTask + 1);
                    for (int m = 0; m < domain.methods[cycles.get(indexOfTask).getHead().getHead()].length; m++) {
                        TaskList[] subT = (domain.methods[cycles.get(indexOfTask).getHead().getHead()][m].getSubs())[0].subtasks;
                        for (int subt = 0; subt < subT.length; subt++) {
                            TaskAtom currentTask = null;
                            if (!subT[subt].getTask().isPrimitive()) {
                                for (TaskAtom compoundtask : compoundtasks) {
                                    if (subT[subt].getTask().getHead().getHead() == compoundtask.getHead().getHead()) {
                                        currentTask = compoundtask;
                                        break;
                                    }
                                }
                            } else currentTask = subT[subt].getTask();
                            if (currentTask.equals(nextTask)) {
                                domain.methods[cycles.get(indexOfTask).getHead().getHead()][m].setEstimationFactor(resource);
                                break;
                            }
                        }
                    }
                }
            }
            for (int index = 0; index < domain.methods[task.getHead().getHead()].length; index++) {
                LinkedList<Double> methodEstimationFactors = new LinkedList<>();

                if (domain.methods[task.getHead().getHead()][index].getEstimationFactor() == -1) {
                    TaskList[] subT = (domain.methods[task.getHead().getHead()][index].getSubs())[0].subtasks;
                    for (int subt = 0; subt < subT.length; subt++) {
                        TaskAtom returnedTask = null;
                        if (!subT[subt].getTask().isPrimitive()) {
                            for (TaskAtom compoundtask : compoundtasks) {
                                if (subT[subt].getTask().getHead().getHead() == compoundtask.getHead().getHead()) {
                                    returnedTask = compoundtask;
                                    break;
                                }
                            }
                        } else returnedTask = subT[subt].getTask();
                        if (!returnedTask.isPrimitive())
                            cycles.addLast(task);
                        LinkedList<TaskAtom> copy = new LinkedList<>();
                        copy.addAll(cycles);
                        double result = findTaskUtility(returnedTask, copy);
                        returnedTask.setUtility(result);
                        methodEstimationFactors.add(result);
                    }
                    if (domain.methods[task.getHead().getHead()][index].getEstimationFactor() == -1)
                        domain.methods[task.getHead().getHead()][index].setEstimationFactor(computeEstimationFactor(methodEstimationFactors, riskAttitude));
                }

                utilitiesOfTaskMethods.add(domain.methods[task.getHead().getHead()][index].getEstimationFactor());
            }
            task.setUtility(Collections.min(utilitiesOfTaskMethods));
            return task.getUtility();
        }
    }

    private double computeEstimationFactor(LinkedList<Double> tasksutilities, int riskAttitude) {
        double retVal;
        double sum = 0;
        for (int i = 0; i < tasksutilities.size(); i++)
            sum += tasksutilities.get(i);
        switch (riskAttitude) {
            case 0:
                retVal = Collections.max(tasksutilities);
                break;
            case 1:
                retVal = Collections.min(tasksutilities);
                break;
            case 2:
                retVal = sum / tasksutilities.size();
                break;
            case 3:
                retVal = sum;
                break;
            default:
                retVal = -1;
                break;
        }
        return retVal;
    }

    /*private double cyclesUtilities(int risk)
    {
        double retVal= 0;
        switch (risk){
            case 0:
                retVal= resource;
                break;
            case 1:
                retVal= -resource;
                break;
            case 2:
                retVal= resource;
                break;
            case 3:
                retVal= resource;
                break;
        }
        return retVal;
    }*/

    /**
     * This function finds plan(s) for a given initial task list.
     *
     * @param tasksIn  the initial task list to be achieved.
     * @param planNoIn the maximum number of plans to be returned.
     * @return 0 or more plans that achieve the given task list.
     */
    public LinkedList findPlans(TaskList tasksIn, int planNoIn) {
        //-- Initialize the plan list to an empty one.
        plans = new LinkedList();

        //-- Initialize the current plan to an empty one.
        currentPlan = new Plan();

        //-- Initialize the current task list to be achieved.
        tasks = tasksIn;

        planNo = planNoIn;

        //-- Call the helper function.
        findPlanHelper(tasks);

        //-- Return the found plan(s).
        return plans;
    }

    /**
     * This is the helper function that finds a plan.
     *
     * @param chosenTask the task list chosen to look for the next task atom to achieve.
     *                   This variable is usually set to the whole task network unless
     *                   there is a method that is chosen to decomopose a task, and the
     *                   decomposition of that task has not gone all the way down to an
     *                   operator. In that case, this variable will be set to the task
     *                   decomposed by that method.
     * @return <code>true</code> if a plan is found, <code>false</code>
     * otherwise.
     */
    private boolean findPlanHelper(TaskList chosenTask) {
        //-- The local variables we need every time this function is called.
        InternalVars v = new InternalVars();

        //-- Find all the tasks that we have the option to achieve right now. This
        //-- equals to the first task in the current task list if it is ordered, or
        //-- the first task in all the subtasks of the current task list if it is
        //-- unordered. In the latter case, if there is an immediate task as the
        //-- first task of any of the subtasks, that immediate task and ONLY that
        //-- immediate task is returned.
        v.t0 = chosenTask.getFirst();

        //-- If there are no tasks left,
        if (v.t0.size() == 0) {
            //-- If the chosen task is not the whole task network the algorithm is
            //-- initially set to achieve, it means we have just achieved that task,
            //-- and not the whole task network. Therefore, try to achieve the rest
            //-- of the task network.
            if (chosenTask != tasks)
                return findPlanHelper(tasks);
                //-- Otherwise, add the current plan to the list of the plans for the
                //-- given task network. Note that in the case where we are looking for
                //-- more than one plan, we add a clone of the current plan to the list
                //-- rather than the current plan itself since the current plan will be
                //-- changed during the look for other plans.
            else {
                if (planNo != 1)
                    plans.addLast(currentPlan.clone());
                else
                    plans.addLast(currentPlan);

                return true;
            }
        }

        //-- This array of size 4 will store the atoms and protections that are
        //-- deleted from and added to the current state of the world as a result
        //-- of an operator being applied. This information is used in case a
        //-- backtrack happens over that operator to store the state of the wolrd
        //-- to what it was before the backtracked operator was applied.
        v.delAdd = new Vector[4];

        //-- To iterate over the tasks we have the option to achieve right now.
        v.e = v.t0.iterator();

        //-- For each of the tasks that we have the option to achieve right now,
        while (v.e.hasNext()) {
            //-- Find the next option.
            v.tl = (TaskList) v.e.next();
            v.t = v.tl.getTask();

            //-- If that task is primitive,
            if (v.t.isPrimitive()) {
                //-- Remove the task from the task list, by replacing it with an empty
                //-- task list.
                v.tl.replace(TaskList.empty);

                //-- Find all the operators that achieve this primitive task.
                v.o = domain.ops[v.t.getHead().getHead()];
                this.orderOperators(v.o);
                //-- For each of these operators,
                for (v.j = 0; v.j < v.o.length; v.j++) {
                    //-- Find the binding that unifies the head of the operator with the
                    //-- task.
                    v.binding = v.o[v.j].unify(v.t.getHead());

                    //-- If there is such bindings,
                    if (v.binding != null) {
                        //-- Get the iterator that iterates over all the bindings that can
                        //-- satisfy the precondition for this operator.
                        v.p = v.o[v.j].getIterator(v.binding, 0);

                        //-- For each such binding,
                        while ((v.nextB = v.p.nextBinding()) != null) {
                            //-- Merge the two bindings.
                            Term.merge(v.nextB, v.binding);

                            double cost = 0;
                            //-- If the operator is applicable, apply it, and,
                            if (v.o[v.j].apply(v.nextB, state, v.delAdd)) {
                                //-- Add the instance of the operator that achieved this task
                                //-- to the beginning of the plan, remembering how much it
                                //-- cost.
                                cost = currentPlan.addOperator(v.o[v.j], v.nextB);
                                // System.out.println(currentPlan.toString());

                                resource -= cost;
                                if (resource < 0) {
                                    currentPlan.removeOperator(cost);
                                    resource += cost;
                                    state.undo(v.delAdd);
                                    break;
                                }

                                //-- Recursively call the same function to achieve the
                                //-- remaining tasks. If a plan is found for the remaining
                                //-- tasks and we have found the maximum number of plans we are
                                //-- allowed, return true.
                                if (findPlanHelper(tasks) && plans.size() >= planNo)
                                    return true;

                                //-- Remove the operator from the current plan.
                                currentPlan.removeOperator(cost);
                                resource += cost;
                            }

                            //-- Undo the changes that were the result of applying this
                            //-- operator, because we are backtracking here.
                            state.undo(v.delAdd);
                        }
                    }
                }

                //-- Insert the task we chose to achieve first back where it was,
                //-- because we couldn't achieve it.
                v.tl.undo();
            }
            //-- If that task is compound,
            else {
                //-- Find all the methods that decompose this compound task.
                v.m = domain.methods[v.t.getHead().getHead()];

                //-- Order the methods depending on the utility value
                this.orderMethods(v.m);

                //-- For each of these methods,
                for (v.j = 0; v.j < v.m.length; v.j++) {

                    //-- Find the binding that unifies the head of the method with the
                    //-- task.
                    v.binding = v.m[v.j].unify(v.t.getHead());

                    //-- If there is such binding,
                    if (v.binding != null) {
                        //-- Initially, precondition of no branch of this method has
                        //-- already been satisfied, so set this variable to false.
                        v.found = false;

                        //-- Iterate on all the branches of this method. note the use of
                        //-- 'v.found' in the condition for the 'for' loop. It is there
                        //-- because of the semantics of the method branches in JSHOP2:
                        //-- Second branch is considered only when there is no binding for
                        //-- the first branch, the third branch is considered only when
                        //-- there is no binding for the first and second branches, etc.
                        for (v.k = 0; (v.k < v.m[v.j].getSubs().length) && !v.found; v.k++) {
                            //-- Get the iterator that iterates over all the bindings that
                            //-- can satisfy the precondition for this branch of this method.
                            v.p = v.m[v.j].getIterator(v.binding, v.k);

                            //-- For each such binding,
                            while ((v.nextB = v.p.nextBinding()) != null) {
                                //-- Merge the two bindings.
                                Term.merge(v.nextB, v.binding);

                                //-- Replace the decomposed task in task list with its
                                //-- decomposition according to this branch of this method.
                                v.tl.replace(v.m[v.j].getSubs()[v.k].bind(v.nextB));

                                //-- Recursively call the same function to achieve the
                                //-- remaining tasks, but make the function choose its next
                                //-- tasks to achieve to be the substasks of the task we just
                                //-- decomposed, till an operator is seen and applied, or this
                                //-- whole task is achieved without seeing an operator (i.e.,
                                //-- this task was decomposed to an empty task list).
                                if (findPlanHelper(v.tl) && plans.size() >= planNo)
                                    //-- A full plan is found, return true.
                                    return true;

                                //-- The further branches of this method must NOT be considered
                                //-- even if this branch fails because there has been at least
                                //-- one satisfier for this branch of the method. Set this
                                //-- variable to true to prevent the further branches of this
                                //-- method from being considered.
                                v.found = true;

                                //-- Undo the changes in the task list, because this particular
                                //-- decomposition failed.
                                v.tl.undo();
                            }
                        }
                    }
                }
            }
        }

        //-- Return false, because all the options were tried and none worked.
        return false;
    }

    /**
     * This function returns the planning domain.
     *
     * @return the current planning domain.
     */
    public Domain getDomain() {
        return domain;
    }

    /**
     * This function returns the current state of the world.
     *
     * @return the current state of the world.
     */
    public State getState() {
        return state;
    }

    public String getName() {
        return "MyJSHOP2";
    }

    public void orderMethods(Method[] methods) {
        Arrays.sort(methods, Comparator.comparingDouble(Method::getEstimationFactor));
    }

    public void orderOperators(Operator[] operators) {
        Arrays.sort(operators, Comparator.comparingDouble(x -> x.getCost(null)));
    }

    /**
     * This function is used to initialize the planning algorithm.
     *
     * @param domainIn the planning domain.
     * @param stateIn  the initial state of the world.
     */
    public void initialize(Domain domainIn, State stateIn) {
        domain = domainIn;
        state = stateIn;
    }
}
