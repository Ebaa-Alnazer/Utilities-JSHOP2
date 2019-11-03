import utilities.jshop2.*;
import java.util.Collections;
import java.util.LinkedList;
class Operator0 extends Operator
{
	public Operator0()
	{
		super(new Predicate(0, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(5), TermList.NIL))))))), -1, -1, new TermNumber(5.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(1, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[2];
		addIn[0] = new DelAddAtomic(new Predicate(1, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL)))));
		addIn[1] = new DelAddAtomic(new Predicate(0, 6, new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(0, 6, new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL)))), unifier), 6)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator1 extends Operator
{
	public Operator1()
	{
		super(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[2];
		addIn[0] = new DelAddAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(new TermCall(new List(TermVariable.getVariable(2), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.plus, "StdLib.plus"), TermList.NIL)))));
		addIn[1] = new DelAddAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), new TermList(new TermCall(new List(TermVariable.getVariable(2), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.plus, "StdLib.plus"), TermList.NIL)))), unifier), 4)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator2 extends Operator
{
	public Operator2()
	{
		super(new Predicate(2, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[2];
		addIn[0] = new DelAddAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(new TermCall(new List(TermVariable.getVariable(1), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.plus, "StdLib.plus"), new TermList(TermVariable.getVariable(2), TermList.NIL)))));
		addIn[1] = new DelAddAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(3), new TermList(new TermCall(new List(TermVariable.getVariable(1), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.plus, "StdLib.plus"), new TermList(TermVariable.getVariable(2), TermList.NIL)))), unifier), 4)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator3 extends Operator
{
	public Operator3()
	{
		super(new Predicate(3, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[2];
		addIn[0] = new DelAddAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(new TermCall(new List(TermVariable.getVariable(2), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.minus, "StdLib.minus"), TermList.NIL)))));
		addIn[1] = new DelAddAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), new TermList(new TermCall(new List(TermVariable.getVariable(2), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.minus, "StdLib.minus"), TermList.NIL)))), unifier), 4)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator4 extends Operator
{
	public Operator4()
	{
		super(new Predicate(4, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[2];
		addIn[0] = new DelAddAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(new TermCall(new List(TermVariable.getVariable(1), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.minus, "StdLib.minus"), new TermList(TermVariable.getVariable(2), TermList.NIL)))));
		addIn[1] = new DelAddAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(3), new TermList(new TermCall(new List(TermVariable.getVariable(1), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.minus, "StdLib.minus"), new TermList(TermVariable.getVariable(2), TermList.NIL)))), unifier), 4)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator5 extends Operator
{
	public Operator5()
	{
		super(new Predicate(5, 0, TermList.NIL), -1, -1, new TermNumber(0.0));


		DelAddElement[] delIn = new DelAddElement[0];

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[0];

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(0)).setComparator(null);
		p.reset();

		return p;
	}
}

class Precondition0 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition0(Term[] unifier)
	{
		p = new Precondition[2];
		p[0] = new PreconditionAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL)))), unifier);
		p[1] = new PreconditionAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL)))), unifier);
		b = new Term[2][];

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		p[0].bind(binding);
		p[1].bind(binding);
	}

	protected Term[] nextBindingHelper()
	{
		if (b[0] == null)
			return null;

		b[1] = p[1].nextBinding();
		while (b[1] == null)
		{
			b[0] = p[0].nextBinding();
			if (b[0] == null)
				return null;
			p[1].reset();
			p[1].bind(b[0]);
			b[1] = p[1].nextBinding();
		}

		return Term.merge(b, 2);
	}

	protected void resetHelper()
	{
		p[0].reset();
		p[1].reset();

		b[0] = p[0].nextBinding();
		if (b[0] == null)
			return;

		p[1].bind(b[0]);
	}
}

class Operator6 extends Operator
{
	public Operator6()
	{
		super(new Predicate(6, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL)))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[0];

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new Precondition0(unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator7 extends Operator
{
	public Operator7()
	{
		super(new Predicate(7, 0, TermList.NIL), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(2, 0, new TermList(new TermNumber(0.0), TermList.NIL)));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(2, 0, new TermList(new TermNumber(1.0), TermList.NIL)));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(0)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator8 extends Operator
{
	public Operator8()
	{
		super(new Predicate(8, 0, TermList.NIL), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[0];

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[0];

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(0)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator9 extends Operator
{
	public Operator9()
	{
		super(new Predicate(9, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[0];

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL)))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL)))), unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Precondition1 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition1(Term[] unifier)
	{
		p = new Precondition[2];
		p[0] = new PreconditionAtomic(new Predicate(1, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL)))), unifier);
		p[1] = new PreconditionAtomic(new Predicate(1, 6, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(5), TermList.NIL)))), unifier);
		b = new Term[2][];

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		p[0].bind(binding);
		p[1].bind(binding);
	}

	protected Term[] nextBindingHelper()
	{
		if (b[0] == null)
			return null;

		b[1] = p[1].nextBinding();
		while (b[1] == null)
		{
			b[0] = p[0].nextBinding();
			if (b[0] == null)
				return null;
			p[1].reset();
			p[1].bind(b[0]);
			b[1] = p[1].nextBinding();
		}

		return Term.merge(b, 2);
	}

	protected void resetHelper()
	{
		p[0].reset();
		p[1].reset();

		b[0] = p[0].nextBinding();
		if (b[0] == null)
			return;

		p[1].bind(b[0]);
	}
}

class Operator10 extends Operator
{
	public Operator10()
	{
		super(new Predicate(10, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(1, 6, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(5), TermList.NIL)))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(1, 6, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL)))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new Precondition1(unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator11 extends Operator
{
	public Operator11()
	{
		super(new Predicate(11, 0, TermList.NIL), -1, -1, new TermNumber(50.0));


		DelAddElement[] delIn = new DelAddElement[0];

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[0];

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(0)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator12 extends Operator
{
	public Operator12()
	{
		super(new Predicate(12, 0, TermList.NIL), -1, -1, new TermNumber(2.0));


		DelAddElement[] delIn = new DelAddElement[0];

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[0];

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(0)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator13 extends Operator
{
	public Operator13()
	{
		super(new Predicate(13, 0, TermList.NIL), -1, -1, new TermNumber(0.0));


		DelAddElement[] delIn = new DelAddElement[0];

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[0];

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(0)).setComparator(null);
		p.reset();

		return p;
	}
}

class Precondition2 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition2(Term[] unifier)
	{
		p = new Precondition[2];
		p[0] = new PreconditionAtomic(new Predicate(1, 8, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(5), TermList.NIL)))), unifier);
		p[1] = new PreconditionAtomic(new Predicate(1, 8, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(6), new TermList(TermVariable.getVariable(7), TermList.NIL)))), unifier);
		b = new Term[2][];

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		p[0].bind(binding);
		p[1].bind(binding);
	}

	protected Term[] nextBindingHelper()
	{
		if (b[0] == null)
			return null;

		b[1] = p[1].nextBinding();
		while (b[1] == null)
		{
			b[0] = p[0].nextBinding();
			if (b[0] == null)
				return null;
			p[1].reset();
			p[1].bind(b[0]);
			b[1] = p[1].nextBinding();
		}

		return Term.merge(b, 2);
	}

	protected void resetHelper()
	{
		p[0].reset();
		p[1].reset();

		b[0] = p[0].nextBinding();
		if (b[0] == null)
			return;

		p[1].bind(b[0]);
	}
}

class Method0 extends Method
{
	public Method0()
	{
		super(new Predicate(4, 8, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 8, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(5), TermList.NIL))))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(1, 8, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, false));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(2, 8, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL)))), false, false));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(3, 8, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition2(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "transport-container";
			default: return null;
		}
	}
}

class Precondition3 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition3(Term[] unifier)
	{
		p = new Precondition[2];
		p[0] = new PreconditionNegation(new PreconditionAtomic(new Predicate(1, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL)))), unifier), 6);
		p[1] = new PreconditionAtomic(new Predicate(1, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(5), TermList.NIL)))), unifier);
		b = new Term[2][];

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		p[0].bind(binding);
		p[1].bind(binding);
	}

	protected Term[] nextBindingHelper()
	{
		if (b[0] == null)
			return null;

		b[1] = p[1].nextBinding();
		while (b[1] == null)
		{
			b[0] = p[0].nextBinding();
			if (b[0] == null)
				return null;
			p[1].reset();
			p[1].bind(b[0]);
			b[1] = p[1].nextBinding();
		}

		return Term.merge(b, 2);
	}

	protected void resetHelper()
	{
		p[0].reset();
		p[1].reset();

		b[0] = p[0].nextBinding();
		if (b[0] == null)
			return;

		p[1].bind(b[0]);
	}
}

class Method1 extends Method
{
	public Method1()
	{
		super(new Predicate(0, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(11, 6, TermList.NIL), false, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(12, 6, TermList.NIL), false, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(13, 6, TermList.NIL), false, true));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(10, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition3(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "send-by-post";
			default: return null;
		}
	}
}

class Method2 extends Method
{
	public Method2()
	{
		super(new Predicate(0, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL)))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionNil(4)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "move-to-container";
			default: return null;
		}
	}
}

class Method3 extends Method
{
	public Method3()
	{
		super(new Predicate(2, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(5, 3, TermList.NIL), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "dont-do-anything";
			default: return null;
		}
	}
}

class Method4 extends Method
{
	public Method4()
	{
		super(new Predicate(2, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(2, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(5, 3, new TermList(TermVariable.getVariable(0), TermList.NIL)), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(2, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), unifier), 3)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "go-step-and-move";
			default: return null;
		}
	}
}

class Precondition4 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition4(Term[] unifier)
	{
		p = new Precondition[4];
		p[0] = new PreconditionNegation(new PreconditionAtomic(new Predicate(1, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), unifier), 6);
		p[1] = new PreconditionAtomic(new Predicate(1, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL)))), unifier);
		p[2] = new PreconditionAtomic(new Predicate(3, 6, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))))), unifier);
		p[3] = new PreconditionAtomic(new Predicate(2, 6, new TermList(TermVariable.getVariable(5), TermList.NIL)), unifier);
		b = new Term[4][];

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		p[0].bind(binding);
		p[1].bind(binding);
		p[2].bind(binding);
		p[3].bind(binding);
	}

	protected Term[] nextBindingHelper()
	{
		if (b[0] == null)
			return null;

		b[3] = p[3].nextBinding();
		while (b[3] == null)
		{
			b[2] = p[2].nextBinding();
			while (b[2] == null)
			{
				b[1] = p[1].nextBinding();
				while (b[1] == null)
				{
					b[0] = p[0].nextBinding();
					if (b[0] == null)
						return null;
					p[1].reset();
					p[1].bind(b[0]);
					b[1] = p[1].nextBinding();
				}
				p[2].reset();
				p[2].bind(Term.merge(b, 2));
				b[2] = p[2].nextBinding();
			}
			p[3].reset();
			p[3].bind(Term.merge(b, 3));
			b[3] = p[3].nextBinding();
		}

		return Term.merge(b, 4);
	}

	protected void resetHelper()
	{
		p[0].reset();
		p[1].reset();
		p[2].reset();
		p[3].reset();

		b[0] = p[0].nextBinding();
		if (b[0] == null)
			return;

		p[1].bind(b[0]);
		b[1] = p[1].nextBinding();
		while (b[1] == null)
		{
			b[0] = p[0].nextBinding();
			if (b[0] == null)
				return;
			p[1].reset();
			p[1].bind(b[0]);
			b[1] = p[1].nextBinding();
		}

		p[2].bind(Term.merge(b, 2));
		b[2] = p[2].nextBinding();
		while (b[2] == null)
		{
			b[1] = p[1].nextBinding();
			while (b[1] == null)
			{
				b[0] = p[0].nextBinding();
				if (b[0] == null)
					return;
				p[1].reset();
				p[1].bind(b[0]);
				b[1] = p[1].nextBinding();
			}
			p[2].reset();
			p[2].bind(Term.merge(b, 2));
			b[2] = p[2].nextBinding();
		}

		p[3].bind(Term.merge(b, 3));
	}
}

class Method5 extends Method
{
	public Method5()
	{
		super(new Predicate(2, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(5), TermList.NIL))))))), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition4(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "go-shortcut";
			default: return null;
		}
	}
}

class Precondition5 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition5(Term[] unifier)
	{
		p = new Precondition[3];
		p[0] = new PreconditionAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), unifier);
		p[1] = new PreconditionAtomic(new Predicate(4, 4, new TermList(TermVariable.getVariable(1), new TermList(new TermCall(new List(TermVariable.getVariable(2), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.plus, "StdLib.plus"), TermList.NIL))), unifier);
		p[2] = new PreconditionAtomic(new Predicate(2, 4, new TermList(TermVariable.getVariable(3), TermList.NIL)), unifier);
		b = new Term[3][];

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		p[0].bind(binding);
		p[1].bind(binding);
		p[2].bind(binding);
	}

	protected Term[] nextBindingHelper()
	{
		if (b[0] == null)
			return null;

		b[2] = p[2].nextBinding();
		while (b[2] == null)
		{
			b[1] = p[1].nextBinding();
			while (b[1] == null)
			{
				b[0] = p[0].nextBinding();
				if (b[0] == null)
					return null;
				p[1].reset();
				p[1].bind(b[0]);
				b[1] = p[1].nextBinding();
			}
			p[2].reset();
			p[2].bind(Term.merge(b, 2));
			b[2] = p[2].nextBinding();
		}

		return Term.merge(b, 3);
	}

	protected void resetHelper()
	{
		p[0].reset();
		p[1].reset();
		p[2].reset();

		b[0] = p[0].nextBinding();
		if (b[0] == null)
			return;

		p[1].bind(b[0]);
		b[1] = p[1].nextBinding();
		while (b[1] == null)
		{
			b[0] = p[0].nextBinding();
			if (b[0] == null)
				return;
			p[1].reset();
			p[1].bind(b[0]);
			b[1] = p[1].nextBinding();
		}

		p[2].bind(Term.merge(b, 2));
	}
}

class Method6 extends Method
{
	public Method6()
	{
		super(new Predicate(5, 4, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition5(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "go-north";
			default: return null;
		}
	}
}

class Precondition6 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition6(Term[] unifier)
	{
		p = new Precondition[3];
		p[0] = new PreconditionAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), unifier);
		p[1] = new PreconditionAtomic(new Predicate(4, 4, new TermList(new TermCall(new List(TermVariable.getVariable(1), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.plus, "StdLib.plus"), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[2] = new PreconditionAtomic(new Predicate(2, 4, new TermList(TermVariable.getVariable(3), TermList.NIL)), unifier);
		b = new Term[3][];

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		p[0].bind(binding);
		p[1].bind(binding);
		p[2].bind(binding);
	}

	protected Term[] nextBindingHelper()
	{
		if (b[0] == null)
			return null;

		b[2] = p[2].nextBinding();
		while (b[2] == null)
		{
			b[1] = p[1].nextBinding();
			while (b[1] == null)
			{
				b[0] = p[0].nextBinding();
				if (b[0] == null)
					return null;
				p[1].reset();
				p[1].bind(b[0]);
				b[1] = p[1].nextBinding();
			}
			p[2].reset();
			p[2].bind(Term.merge(b, 2));
			b[2] = p[2].nextBinding();
		}

		return Term.merge(b, 3);
	}

	protected void resetHelper()
	{
		p[0].reset();
		p[1].reset();
		p[2].reset();

		b[0] = p[0].nextBinding();
		if (b[0] == null)
			return;

		p[1].bind(b[0]);
		b[1] = p[1].nextBinding();
		while (b[1] == null)
		{
			b[0] = p[0].nextBinding();
			if (b[0] == null)
				return;
			p[1].reset();
			p[1].bind(b[0]);
			b[1] = p[1].nextBinding();
		}

		p[2].bind(Term.merge(b, 2));
	}
}

class Method7 extends Method
{
	public Method7()
	{
		super(new Predicate(5, 4, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition6(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "go-east";
			default: return null;
		}
	}
}

class Precondition7 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition7(Term[] unifier)
	{
		p = new Precondition[3];
		p[0] = new PreconditionAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), unifier);
		p[1] = new PreconditionAtomic(new Predicate(4, 4, new TermList(TermVariable.getVariable(1), new TermList(new TermCall(new List(TermVariable.getVariable(2), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.minus, "StdLib.minus"), TermList.NIL))), unifier);
		p[2] = new PreconditionAtomic(new Predicate(2, 4, new TermList(TermVariable.getVariable(3), TermList.NIL)), unifier);
		b = new Term[3][];

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		p[0].bind(binding);
		p[1].bind(binding);
		p[2].bind(binding);
	}

	protected Term[] nextBindingHelper()
	{
		if (b[0] == null)
			return null;

		b[2] = p[2].nextBinding();
		while (b[2] == null)
		{
			b[1] = p[1].nextBinding();
			while (b[1] == null)
			{
				b[0] = p[0].nextBinding();
				if (b[0] == null)
					return null;
				p[1].reset();
				p[1].bind(b[0]);
				b[1] = p[1].nextBinding();
			}
			p[2].reset();
			p[2].bind(Term.merge(b, 2));
			b[2] = p[2].nextBinding();
		}

		return Term.merge(b, 3);
	}

	protected void resetHelper()
	{
		p[0].reset();
		p[1].reset();
		p[2].reset();

		b[0] = p[0].nextBinding();
		if (b[0] == null)
			return;

		p[1].bind(b[0]);
		b[1] = p[1].nextBinding();
		while (b[1] == null)
		{
			b[0] = p[0].nextBinding();
			if (b[0] == null)
				return;
			p[1].reset();
			p[1].bind(b[0]);
			b[1] = p[1].nextBinding();
		}

		p[2].bind(Term.merge(b, 2));
	}
}

class Method8 extends Method
{
	public Method8()
	{
		super(new Predicate(5, 4, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(3, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition7(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "go-south";
			default: return null;
		}
	}
}

class Precondition8 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition8(Term[] unifier)
	{
		p = new Precondition[3];
		p[0] = new PreconditionAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), unifier);
		p[1] = new PreconditionAtomic(new Predicate(4, 4, new TermList(new TermCall(new List(TermVariable.getVariable(1), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.minus, "StdLib.minus"), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[2] = new PreconditionAtomic(new Predicate(2, 4, new TermList(TermVariable.getVariable(3), TermList.NIL)), unifier);
		b = new Term[3][];

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		p[0].bind(binding);
		p[1].bind(binding);
		p[2].bind(binding);
	}

	protected Term[] nextBindingHelper()
	{
		if (b[0] == null)
			return null;

		b[2] = p[2].nextBinding();
		while (b[2] == null)
		{
			b[1] = p[1].nextBinding();
			while (b[1] == null)
			{
				b[0] = p[0].nextBinding();
				if (b[0] == null)
					return null;
				p[1].reset();
				p[1].bind(b[0]);
				b[1] = p[1].nextBinding();
			}
			p[2].reset();
			p[2].bind(Term.merge(b, 2));
			b[2] = p[2].nextBinding();
		}

		return Term.merge(b, 3);
	}

	protected void resetHelper()
	{
		p[0].reset();
		p[1].reset();
		p[2].reset();

		b[0] = p[0].nextBinding();
		if (b[0] == null)
			return;

		p[1].bind(b[0]);
		b[1] = p[1].nextBinding();
		while (b[1] == null)
		{
			b[0] = p[0].nextBinding();
			if (b[0] == null)
				return;
			p[1].reset();
			p[1].bind(b[0]);
			b[1] = p[1].nextBinding();
		}

		p[2].bind(Term.merge(b, 2));
	}
}

class Method9 extends Method
{
	public Method9()
	{
		super(new Predicate(5, 4, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(4, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition8(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "go-west";
			default: return null;
		}
	}
}

class Method10 extends Method
{
	public Method10()
	{
		super(new Predicate(1, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(2, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(6, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(7, 2, TermList.NIL), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionNil(2)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "setup";
			default: return null;
		}
	}
}

class Method11 extends Method
{
	public Method11()
	{
		super(new Predicate(3, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(2, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(8, 2, TermList.NIL), false, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(9, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionNil(2)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "finish";
			default: return null;
		}
	}
}

class Precondition9 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition9(Term[] unifier)
	{
		p = new Precondition[5];
		p[0] = new PreconditionAtomic(new Predicate(5, 3, new TermList(TermVariable.getVariable(2), TermList.NIL)), unifier);
		p[1] = new PreconditionCall(new TermCall(new List(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL)), StdLib.less, "StdLib.less"), unifier);
		p[2] = new PreconditionCall(new TermCall(new List(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)), StdLib.less, "StdLib.less"), unifier);
		p[3] = new PreconditionCall(new TermCall(new List(TermVariable.getVariable(0), new TermList(new TermNumber(0.0), TermList.NIL)), StdLib.moreEq, "StdLib.moreEq"), unifier);
		p[4] = new PreconditionCall(new TermCall(new List(TermVariable.getVariable(1), new TermList(new TermNumber(0.0), TermList.NIL)), StdLib.moreEq, "StdLib.moreEq"), unifier);
		b = new Term[5][];

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		p[0].bind(binding);
		p[1].bind(binding);
		p[2].bind(binding);
		p[3].bind(binding);
		p[4].bind(binding);
	}

	protected Term[] nextBindingHelper()
	{
		if (b[0] == null)
			return null;

		b[4] = p[4].nextBinding();
		while (b[4] == null)
		{
			b[3] = p[3].nextBinding();
			while (b[3] == null)
			{
				b[2] = p[2].nextBinding();
				while (b[2] == null)
				{
					b[1] = p[1].nextBinding();
					while (b[1] == null)
					{
						b[0] = p[0].nextBinding();
						if (b[0] == null)
							return null;
						p[1].reset();
						p[1].bind(b[0]);
						b[1] = p[1].nextBinding();
					}
					p[2].reset();
					p[2].bind(Term.merge(b, 2));
					b[2] = p[2].nextBinding();
				}
				p[3].reset();
				p[3].bind(Term.merge(b, 3));
				b[3] = p[3].nextBinding();
			}
			p[4].reset();
			p[4].bind(Term.merge(b, 4));
			b[4] = p[4].nextBinding();
		}

		return Term.merge(b, 5);
	}

	protected void resetHelper()
	{
		p[0].reset();
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();

		b[0] = p[0].nextBinding();
		if (b[0] == null)
			return;

		p[1].bind(b[0]);
		b[1] = p[1].nextBinding();
		while (b[1] == null)
		{
			b[0] = p[0].nextBinding();
			if (b[0] == null)
				return;
			p[1].reset();
			p[1].bind(b[0]);
			b[1] = p[1].nextBinding();
		}

		p[2].bind(Term.merge(b, 2));
		b[2] = p[2].nextBinding();
		while (b[2] == null)
		{
			b[1] = p[1].nextBinding();
			while (b[1] == null)
			{
				b[0] = p[0].nextBinding();
				if (b[0] == null)
					return;
				p[1].reset();
				p[1].bind(b[0]);
				b[1] = p[1].nextBinding();
			}
			p[2].reset();
			p[2].bind(Term.merge(b, 2));
			b[2] = p[2].nextBinding();
		}

		p[3].bind(Term.merge(b, 3));
		b[3] = p[3].nextBinding();
		while (b[3] == null)
		{
			b[2] = p[2].nextBinding();
			while (b[2] == null)
			{
				b[1] = p[1].nextBinding();
				while (b[1] == null)
				{
					b[0] = p[0].nextBinding();
					if (b[0] == null)
						return;
					p[1].reset();
					p[1].bind(b[0]);
					b[1] = p[1].nextBinding();
				}
				p[2].reset();
				p[2].bind(Term.merge(b, 2));
				b[2] = p[2].nextBinding();
			}
			p[3].reset();
			p[3].bind(Term.merge(b, 3));
			b[3] = p[3].nextBinding();
		}

		p[4].bind(Term.merge(b, 4));
	}
}

class Axiom0 extends Axiom
{
	public Axiom0()
	{
		super(new Predicate(4, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), 1);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition9(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Axiom0Branch0";
			default: return null;
		}
	}
}

public class movecontainer extends Domain
{
	public movecontainer()
	{
		TermVariable.initialize(8);

		constants = new String[6];
		constants[0] = "dont-visit";
		constants[1] = "at";
		constants[2] = "stage";
		constants[3] = "shortcut";
		constants[4] = "inside";
		constants[5] = "size";

		compoundTasks = new String[6];
		compoundTasks[0] = "meet-container-truck";
		compoundTasks[1] = "setup";
		compoundTasks[2] = "move";
		compoundTasks[3] = "finish";
		compoundTasks[4] = "transport-container";
		compoundTasks[5] = "go-step";

		primitiveTasks = new String[14];
		primitiveTasks[0] = "!go-shortcut";
		primitiveTasks[1] = "!go-north";
		primitiveTasks[2] = "!go-east";
		primitiveTasks[3] = "!go-south";
		primitiveTasks[4] = "!go-west";
		primitiveTasks[5] = "!nop";
		primitiveTasks[6] = "!take";
		primitiveTasks[7] = "!load";
		primitiveTasks[8] = "!unload";
		primitiveTasks[9] = "!put";
		primitiveTasks[10] = "!go-to-post";
		primitiveTasks[11] = "!online-stamping";
		primitiveTasks[12] = "!packaging";
		primitiveTasks[13] = "!write-address";

		methods = new Method[6][];

		methods[0] = new Method[2];
		methods[0][0] = new Method1();
		methods[0][1] = new Method2();

		methods[1] = new Method[1];
		methods[1][0] = new Method10();

		methods[2] = new Method[3];
		methods[2][0] = new Method3();
		methods[2][1] = new Method4();
		methods[2][2] = new Method5();

		methods[3] = new Method[1];
		methods[3][0] = new Method11();

		methods[4] = new Method[1];
		methods[4][0] = new Method0();

		methods[5] = new Method[4];
		methods[5][0] = new Method6();
		methods[5][1] = new Method7();
		methods[5][2] = new Method8();
		methods[5][3] = new Method9();


		ops = new Operator[14][];

		ops[0] = new Operator[1];
		ops[0][0] = new Operator0();

		ops[1] = new Operator[1];
		ops[1][0] = new Operator1();

		ops[2] = new Operator[1];
		ops[2][0] = new Operator2();

		ops[3] = new Operator[1];
		ops[3][0] = new Operator3();

		ops[4] = new Operator[1];
		ops[4][0] = new Operator4();

		ops[5] = new Operator[1];
		ops[5][0] = new Operator5();

		ops[6] = new Operator[1];
		ops[6][0] = new Operator6();

		ops[7] = new Operator[1];
		ops[7][0] = new Operator7();

		ops[8] = new Operator[1];
		ops[8][0] = new Operator8();

		ops[9] = new Operator[1];
		ops[9][0] = new Operator9();

		ops[10] = new Operator[1];
		ops[10][0] = new Operator10();

		ops[11] = new Operator[1];
		ops[11][0] = new Operator11();

		ops[12] = new Operator[1];
		ops[12][0] = new Operator12();

		ops[13] = new Operator[1];
		ops[13][0] = new Operator13();

		axioms = new Axiom[6][];

		axioms[0] = new Axiom[0];

		axioms[1] = new Axiom[0];

		axioms[2] = new Axiom[0];

		axioms[3] = new Axiom[0];

		axioms[4] = new Axiom[1];
		axioms[4][0] = new Axiom0();

		axioms[5] = new Axiom[0];


}
}
