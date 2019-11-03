import utilities.jshop2.*;

public class problem
{
	private static String[] defineConstants()
	{
		String[] problemConstants = new String[9];

		problemConstants[0] = "downtown";
		problemConstants[1] = "park";
		problemConstants[2] = "uptown";
		problemConstants[3] = "suburb";
		problemConstants[4] = "taxi1";
		problemConstants[5] = "taxi2";
		problemConstants[6] = "bus1";
		problemConstants[7] = "bus2";
		problemConstants[8] = "bus3";

		return problemConstants;
	}

	private static void createState0(State s)	{
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(10), TermList.NIL)));
		s.add(new Predicate(9, 0, new TermList(TermConstant.getConstant(8), TermList.NIL)));
		s.add(new Predicate(1, 0, new TermList(new TermNumber(15.0), TermList.NIL)));
		s.add(new Predicate(4, 0, new TermList(TermConstant.getConstant(10), new TermList(TermConstant.getConstant(11), new TermList(new TermNumber(2.0), TermList.NIL)))));
		s.add(new Predicate(4, 0, new TermList(TermConstant.getConstant(10), new TermList(TermConstant.getConstant(12), new TermList(new TermNumber(8.0), TermList.NIL)))));
		s.add(new Predicate(4, 0, new TermList(TermConstant.getConstant(10), new TermList(TermConstant.getConstant(13), new TermList(new TermNumber(12.0), TermList.NIL)))));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(14), new TermList(TermConstant.getConstant(10), TermList.NIL))));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(15), new TermList(TermConstant.getConstant(10), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(16), new TermList(TermConstant.getConstant(10), new TermList(TermConstant.getConstant(11), TermList.NIL)))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(17), new TermList(TermConstant.getConstant(10), new TermList(TermConstant.getConstant(12), TermList.NIL)))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(18), new TermList(TermConstant.getConstant(10), new TermList(TermConstant.getConstant(13), TermList.NIL)))));
	}

	public static void main(String[] args) throws InterruptedException
	{
		TermConstant.initialize(19);

		Domain d = new myexample();

		d.setProblemConstants(defineConstants());

		State s = new State(10, d.getAxioms());

		Factory.getInstance().setIsJSHOP2(true);


		Factory.getInstance().getAlgorithm().initialize(d, s);

		TaskList tl;
		Thread thread;

		createState0(s);

		tl = new TaskList(1, true);
		tl.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 0, new TermList(TermConstant.getConstant(13), TermList.NIL)), false, false));

		thread = new SolverThread(tl, 1);
		thread.start();
		while (thread.isAlive())
			Thread.sleep(500);
	}
}