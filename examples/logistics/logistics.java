import utilities.jshop2.*;
import java.util.Collections;
import java.util.LinkedList;
class Operator0 extends Operator
{
	public Operator0()
	{
		super(new Predicate(0, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[2];
		delIn[0] = new DelAddAtomic(new Predicate(0, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		delIn[1] = new DelAddProtection(new Predicate(1, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(2, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(3)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator1 extends Operator
{
	public Operator1()
	{
		super(new Predicate(1, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[2];
		delIn[0] = new DelAddAtomic(new Predicate(2, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		delIn[1] = new DelAddProtection(new Predicate(1, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(0, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(3)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator2 extends Operator
{
	public Operator2()
	{
		super(new Predicate(2, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[2];
		delIn[0] = new DelAddAtomic(new Predicate(0, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		delIn[1] = new DelAddProtection(new Predicate(3, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(4, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(3)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator3 extends Operator
{
	public Operator3()
	{
		super(new Predicate(3, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[2];
		delIn[0] = new DelAddAtomic(new Predicate(4, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		delIn[1] = new DelAddProtection(new Predicate(3, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(0, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(3)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator4 extends Operator
{
	public Operator4()
	{
		super(new Predicate(4, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[2];
		addIn[0] = new DelAddAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		addIn[1] = new DelAddProtection(new Predicate(1, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(3)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator5 extends Operator
{
	public Operator5()
	{
		super(new Predicate(5, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(3, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[2];
		addIn[0] = new DelAddAtomic(new Predicate(3, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		addIn[1] = new DelAddProtection(new Predicate(3, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(3)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator6 extends Operator
{
	public Operator6()
	{
		super(new Predicate(6, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[0];

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddProtection(new Predicate(0, 1));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(1)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator7 extends Operator
{
	public Operator7()
	{
		super(new Predicate(7, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddProtection(new Predicate(0, 1));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[0];

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(1)).setComparator(null);
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
		p = new Precondition[4];
		p[0] = new PreconditionAtomic(new Predicate(5, 10, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[1] = new PreconditionAtomic(new Predicate(0, 10, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier);
		p[2] = new PreconditionAtomic(new Predicate(5, 10, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[3] = new PreconditionAtomic(new Predicate(6, 10, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
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

class Precondition1 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition1(Term[] unifier)
	{
		p = new Precondition[10];
		p[0] = new PreconditionAtomic(new Predicate(5, 10, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[1] = new PreconditionAtomic(new Predicate(0, 10, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier);
		p[2] = new PreconditionAtomic(new Predicate(5, 10, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(5), TermList.NIL))), unifier);
		p[3] = new PreconditionAtomic(new Predicate(7, 10, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(5), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(6, 10, new TermList(TermVariable.getVariable(6), new TermList(TermVariable.getVariable(5), TermList.NIL))), unifier);
		p[5] = new PreconditionAtomic(new Predicate(6, 10, new TermList(TermVariable.getVariable(7), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[6] = new PreconditionAtomic(new Predicate(8, 10, new TermList(TermVariable.getVariable(8), TermList.NIL)), unifier);
		p[7] = new PreconditionAtomic(new Predicate(5, 10, new TermList(TermVariable.getVariable(8), new TermList(TermVariable.getVariable(5), TermList.NIL))), unifier);
		p[8] = new PreconditionAtomic(new Predicate(8, 10, new TermList(TermVariable.getVariable(9), TermList.NIL)), unifier);
		p[9] = new PreconditionAtomic(new Predicate(5, 10, new TermList(TermVariable.getVariable(9), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		b = new Term[10][];

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		p[0].bind(binding);
		p[1].bind(binding);
		p[2].bind(binding);
		p[3].bind(binding);
		p[4].bind(binding);
		p[5].bind(binding);
		p[6].bind(binding);
		p[7].bind(binding);
		p[8].bind(binding);
		p[9].bind(binding);
	}

	protected Term[] nextBindingHelper()
	{
		if (b[0] == null)
			return null;

		b[9] = p[9].nextBinding();
		while (b[9] == null)
		{
			b[8] = p[8].nextBinding();
			while (b[8] == null)
			{
				b[7] = p[7].nextBinding();
				while (b[7] == null)
				{
					b[6] = p[6].nextBinding();
					while (b[6] == null)
					{
						b[5] = p[5].nextBinding();
						while (b[5] == null)
						{
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
							p[5].reset();
							p[5].bind(Term.merge(b, 5));
							b[5] = p[5].nextBinding();
						}
						p[6].reset();
						p[6].bind(Term.merge(b, 6));
						b[6] = p[6].nextBinding();
					}
					p[7].reset();
					p[7].bind(Term.merge(b, 7));
					b[7] = p[7].nextBinding();
				}
				p[8].reset();
				p[8].bind(Term.merge(b, 8));
				b[8] = p[8].nextBinding();
			}
			p[9].reset();
			p[9].bind(Term.merge(b, 9));
			b[9] = p[9].nextBinding();
		}

		return Term.merge(b, 10);
	}

	protected void resetHelper()
	{
		p[0].reset();
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		p[5].reset();
		p[6].reset();
		p[7].reset();
		p[8].reset();
		p[9].reset();

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
			p[4].reset();
			p[4].bind(Term.merge(b, 4));
			b[4] = p[4].nextBinding();
		}

		p[5].bind(Term.merge(b, 5));
		b[5] = p[5].nextBinding();
		while (b[5] == null)
		{
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
				p[4].reset();
				p[4].bind(Term.merge(b, 4));
				b[4] = p[4].nextBinding();
			}
			p[5].reset();
			p[5].bind(Term.merge(b, 5));
			b[5] = p[5].nextBinding();
		}

		p[6].bind(Term.merge(b, 6));
		b[6] = p[6].nextBinding();
		while (b[6] == null)
		{
			b[5] = p[5].nextBinding();
			while (b[5] == null)
			{
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
					p[4].reset();
					p[4].bind(Term.merge(b, 4));
					b[4] = p[4].nextBinding();
				}
				p[5].reset();
				p[5].bind(Term.merge(b, 5));
				b[5] = p[5].nextBinding();
			}
			p[6].reset();
			p[6].bind(Term.merge(b, 6));
			b[6] = p[6].nextBinding();
		}

		p[7].bind(Term.merge(b, 7));
		b[7] = p[7].nextBinding();
		while (b[7] == null)
		{
			b[6] = p[6].nextBinding();
			while (b[6] == null)
			{
				b[5] = p[5].nextBinding();
				while (b[5] == null)
				{
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
						p[4].reset();
						p[4].bind(Term.merge(b, 4));
						b[4] = p[4].nextBinding();
					}
					p[5].reset();
					p[5].bind(Term.merge(b, 5));
					b[5] = p[5].nextBinding();
				}
				p[6].reset();
				p[6].bind(Term.merge(b, 6));
				b[6] = p[6].nextBinding();
			}
			p[7].reset();
			p[7].bind(Term.merge(b, 7));
			b[7] = p[7].nextBinding();
		}

		p[8].bind(Term.merge(b, 8));
		b[8] = p[8].nextBinding();
		while (b[8] == null)
		{
			b[7] = p[7].nextBinding();
			while (b[7] == null)
			{
				b[6] = p[6].nextBinding();
				while (b[6] == null)
				{
					b[5] = p[5].nextBinding();
					while (b[5] == null)
					{
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
							p[4].reset();
							p[4].bind(Term.merge(b, 4));
							b[4] = p[4].nextBinding();
						}
						p[5].reset();
						p[5].bind(Term.merge(b, 5));
						b[5] = p[5].nextBinding();
					}
					p[6].reset();
					p[6].bind(Term.merge(b, 6));
					b[6] = p[6].nextBinding();
				}
				p[7].reset();
				p[7].bind(Term.merge(b, 7));
				b[7] = p[7].nextBinding();
			}
			p[8].reset();
			p[8].bind(Term.merge(b, 8));
			b[8] = p[8].nextBinding();
		}

		p[9].bind(Term.merge(b, 9));
	}
}

class Method0 extends Method
{
	public Method0()
	{
		super(new Predicate(2, 10, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		TaskList[] subsIn = new TaskList[2];

		subsIn[0] = createTaskList0();
		subsIn[1] = createTaskList1();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 10, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), TermList.NIL))))), false, false));

		return retVal;
	}

	TaskList createTaskList1()
	{
		TaskList retVal;

		retVal = new TaskList(3, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 10, new TermList(TermVariable.getVariable(6), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(8), TermList.NIL))))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(1, 10, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(8), new TermList(TermVariable.getVariable(9), TermList.NIL)))), false, false));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(0, 10, new TermList(TermVariable.getVariable(7), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(9), new TermList(TermVariable.getVariable(1), TermList.NIL))))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition0(unifier)).setComparator(null);
			break;
			case 1:
				p = (new Precondition1(unifier)).setComparator(null);
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
			case 0: return "Method0Branch0";
			case 1: return "Method0Branch1";
			default: return null;
		}
	}
}

class Precondition2 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition2(Term[] unifier)
	{
		p = new Precondition[2];
		p[0] = new PreconditionAtomic(new Predicate(5, 5, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier);
		p[1] = new PreconditionAtomic(new Predicate(6, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier);
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
		super(new Predicate(0, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))));
		TaskList[] subsIn = new TaskList[2];

		subsIn[0] = TaskList.empty;
		subsIn[1] = createTaskList1();

		setSubs(subsIn);
	}

	TaskList createTaskList1()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(3, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(0, 5, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL)))), true, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), false, false));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(1, 5, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL)))), true, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionAtomic(new Predicate(9, 5, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier)).setComparator(null);
			break;
			case 1:
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
			case 0: return "Method1Branch0";
			case 1: return "Method1Branch1";
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
		p[0] = new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[1] = new PreconditionAtomic(new Predicate(7, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
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

class Precondition4 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition4(Term[] unifier)
	{
		p = new Precondition[2];
		p[0] = new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[1] = new PreconditionAtomic(new Predicate(9, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
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

class Method2 extends Method
{
	public Method2()
	{
		super(new Predicate(3, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		TaskList[] subsIn = new TaskList[2];

		subsIn[0] = createTaskList0();
		subsIn[1] = createTaskList1();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(4, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL)))), true, true));

		return retVal;
	}

	TaskList createTaskList1()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(6, 3, new TermList(new TermList(TermConstant.getConstant(1), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), TermList.NIL)), true, true));

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
			case 1:
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
			case 0: return "Method2Branch0";
			case 1: return "Method2Branch1";
			default: return null;
		}
	}
}

class Method3 extends Method
{
	public Method3()
	{
		super(new Predicate(1, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));
		TaskList[] subsIn = new TaskList[2];

		subsIn[0] = createTaskList0();
		subsIn[1] = createTaskList1();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(6, 5, new TermList(new TermList(TermConstant.getConstant(3), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), TermList.NIL))), TermList.NIL)), true, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(2, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(4, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL))), false, false));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(3, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL)))), false, true));

		return retVal;
	}

	TaskList createTaskList1()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(5, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(1), TermList.NIL)))), true, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(2, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(4, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL))), false, false));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(3, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL)))), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionAtomic(new Predicate(3, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier)).setComparator(null);
			break;
			case 1:
				p = (new PreconditionAtomic(new Predicate(3, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier)).setComparator(null);
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
			case 0: return "airplane-at-the-current-airport";
			case 1: return "Method3Branch1";
			default: return null;
		}
	}
}

class Method4 extends Method
{
	public Method4()
	{
		super(new Predicate(4, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		TaskList[] subsIn = new TaskList[2];

		subsIn[0] = createTaskList0();
		subsIn[1] = createTaskList1();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(6, 3, new TermList(new TermList(TermConstant.getConstant(3), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), TermList.NIL)), true, true));

		return retVal;
	}

	TaskList createTaskList1()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(5, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL)))), true, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionAtomic(new Predicate(3, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier)).setComparator(null);
			break;
			case 1:
				p = (new PreconditionAtomic(new Predicate(3, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier)).setComparator(null);
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
			case 0: return "airplane-already-there";
			case 1: return "fly-airplane-in";
			default: return null;
		}
	}
}

class Axiom0 extends Axiom
{
	public Axiom0()
	{
		super(new Predicate(9, 1, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(0), TermList.NIL))), 1);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionNil(1)).setComparator(null);
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

class Axiom1 extends Axiom
{
	public Axiom1()
	{
		super(new Predicate(7, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), 1);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(9, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier), 2)).setComparator(null);
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
			case 0: return "Axiom1Branch0";
			default: return null;
		}
	}
}

public class logistics extends Domain
{
	public logistics()
	{
		TermVariable.initialize(10);

		constants = new String[10];
		constants[0] = "obj-at";
		constants[1] = "truck-at";
		constants[2] = "in-truck";
		constants[3] = "airplane-at";
		constants[4] = "in-airplane";
		constants[5] = "in-city";
		constants[6] = "truck";
		constants[7] = "different";
		constants[8] = "airport";
		constants[9] = "same";

		compoundTasks = new String[5];
		compoundTasks[0] = "in-city-delivery";
		compoundTasks[1] = "air-deliver-obj";
		compoundTasks[2] = "obj-at";
		compoundTasks[3] = "truck-at";
		compoundTasks[4] = "fly-airplane";

		primitiveTasks = new String[8];
		primitiveTasks[0] = "!load-truck";
		primitiveTasks[1] = "!unload-truck";
		primitiveTasks[2] = "!load-airplane";
		primitiveTasks[3] = "!unload-airplane";
		primitiveTasks[4] = "!drive-truck";
		primitiveTasks[5] = "!fly-airplane";
		primitiveTasks[6] = "!add-protection";
		primitiveTasks[7] = "!delete-protection";

		methods = new Method[5][];

		methods[0] = new Method[1];
		methods[0][0] = new Method1();

		methods[1] = new Method[1];
		methods[1][0] = new Method3();

		methods[2] = new Method[1];
		methods[2][0] = new Method0();

		methods[3] = new Method[1];
		methods[3][0] = new Method2();

		methods[4] = new Method[1];
		methods[4][0] = new Method4();


		ops = new Operator[8][];

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

		axioms = new Axiom[10][];

		axioms[0] = new Axiom[0];

		axioms[1] = new Axiom[0];

		axioms[2] = new Axiom[0];

		axioms[3] = new Axiom[0];

		axioms[4] = new Axiom[0];

		axioms[5] = new Axiom[0];

		axioms[6] = new Axiom[0];

		axioms[7] = new Axiom[1];
		axioms[7][0] = new Axiom1();

		axioms[8] = new Axiom[0];

		axioms[9] = new Axiom[1];
		axioms[9][0] = new Axiom0();


}
}
