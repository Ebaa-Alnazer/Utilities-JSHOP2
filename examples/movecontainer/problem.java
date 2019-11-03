import utilities.jshop2.*;

public class problem
{
	private static String[] defineConstants()
	{
		String[] problemConstants = new String[4];

		problemConstants[0] = "t0";
		problemConstants[1] = "truck";
		problemConstants[2] = "c0";
		problemConstants[3] = "container";

		return problemConstants;
	}

	private static void createState0(State s)	{
		s.add(new Predicate(5, 0, new TermList(new TermNumber(24.0), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(new TermNumber(0.0), TermList.NIL)));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(6), new TermList(new TermNumber(1.0), new TermList(new TermNumber(1.0), TermList.NIL)))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(8), new TermList(new TermNumber(22.0), new TermList(new TermNumber(22.0), TermList.NIL)))));
	}

	public static void main(String[] args) throws InterruptedException
	{
		TermConstant.initialize(10);

		Domain d = new movecontainer();

		d.setProblemConstants(defineConstants());

		State s = new State(6, d.getAxioms());

		Factory.getInstance().setCSV(false);


		Factory.getInstance().setIsJSHOP2(false);


		Factory.getInstance().setResource(350.0);


		Factory.getInstance().getAlgorithm().initialize(d, s);

		MyJSHOP2 myAlgo = MyJSHOP2.getInstance();

		myAlgo.setAlgorithmArgs(350.0, 1);

		myAlgo.findUtilities();

		TaskList tl;
		Thread thread;

		createState0(s);

		tl = new TaskList(1, true);
		tl.subtasks[0] = new TaskList(new TaskAtom(new Predicate(4, 0, new TermList(TermConstant.getConstant(8), new TermList(TermConstant.getConstant(6), new TermList(new TermNumber(11.0), new TermList(new TermNumber(11.0), TermList.NIL))))), false, false));

		thread = new SolverThread(tl, 1);
		thread.start();
		while (thread.isAlive())
			Thread.sleep(500);
	}
}