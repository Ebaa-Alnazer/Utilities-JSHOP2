package utilities.jshop2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * The thread that invokes JSHOP2 to solve a planning problem. The only reason
 * to have another thread to solve problems rather than using the main thread
 * to do so is that, in some platforms, the command line parameters that are
 * supposed to change the stack size work only for the threads other than the
 * main thread.
 *
 * @author Okhtay Ilghami
 * @author <a href="http://www.cs.umd.edu/~okhtay">http://www.cs.umd.edu/~okhtay</a>
 * @version 1.0.3
 */
public class SolverThread extends Thread {
    /**
     * The maximum number of plans allowed.
     */
    private int planNo;

    /**
     * The task list to be achieved.
     */
    private TaskList tl;

    /**
     * To initialize this thread.
     *
     * @param tlIn     the task list to be achieved by this thread.
     * @param planNoIn the maximum number of plans allowed.
     */
    public SolverThread(TaskList tlIn, int planNoIn) {
        tl = tlIn;
        planNo = planNoIn;
    }

    /**
     * The function that is called when this thread is invoked.
     */
    public void run() {
        //-- Get the current time.
        long t1 = new GregorianCalendar().getTimeInMillis();

        //-- Solve the planning problem.
        LinkedList p = Factory.getInstance().getAlgorithm().findPlans(tl, planNo);

        //-- Get the current time again, to calculate the time used.
        long t2 = new GregorianCalendar().getTimeInMillis();

    /*System.out.println();
    System.out.println(p.size() + " plan(s) were found:");
    System.out.println();

    //-- Print the plans found.
    Iterator e = p.iterator();
    int i = 0;
    while (e.hasNext())
    {
      System.out.println("Plan #" + ++i + ":");
      System.out.println((Plan)e.next());
    }

    System.out.println("Time Used = " + (t2 - t1) / 1000.0);
    System.out.println();*/
        try {
            String executionFolder = Factory.getInstance().getOutputDirectory();

            if (Factory.getInstance().isCSV()) {
                outputCSV(t1, p, t2, executionFolder);
            } else {
                outputText(t1, p, t2, executionFolder);
            }
        } catch (IOException er) {
            System.out.println("Exception Occurred:");
            er.printStackTrace();
        }
    }

    private void outputCSV(long startTime, LinkedList p, long endTime, String folderPath) throws IOException {
        String fileName = Factory.getInstance().getAlgorithm() instanceof JSHOP2 ? "results-jshop2.csv" : "results-uashop.csv";
        File file;
        if (folderPath != null) {
            file = new File(folderPath, fileName);
        } else {
            file = new File(fileName);
        }
        try (BufferedWriter output = new BufferedWriter(
                new FileWriter(file, true))) {
            Plan plan = (Plan) p.getFirst();
            double duration = (endTime - startTime) / 1000.0;
            double cost = plan.getCost();
            long length = plan.getOperatorsCount();
            output.write(String.format("%s,%s,%s\n", duration, cost, length));
        }
    }

    private void outputText(long startTime, LinkedList p, long endTime, String folderPath) throws IOException {
        File file;
        String fileName = "Result.txt";
        if (folderPath != null) {
            file = new File(folderPath, fileName);
        } else {
            file = new File(fileName);
        }

        BufferedWriter output = new BufferedWriter(new FileWriter(file, true));
        // File file = new File("C://Thesis/tests/test.txt");

        // if(!file.exists())
        // file.createNewFile();

        //Write Content
        //  FileWriter writer = new FileWriter(file,true);
        output.newLine();
        output.append(p.size() + " plan(s) were found:");
        output.newLine();

        //-- Print the plans found.
        Iterator e = p.iterator();
        int i = 0;
        while (e.hasNext()) {
            output.append("Plan #" + ++i + ":");
            output.append(String.valueOf((Plan) e.next()));
        }
        output.newLine();

        output.append("Time Used for planning= " + (endTime - startTime) / 1000.0);
        output.newLine();
        output.close();
    }
}

