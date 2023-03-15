package Expression;

public class Program {

	public static void main(String[] args) {
		Expression constant = new Constant(4);
		System.out.println(constant.Evaluate());
		
		Expression e1, e2, e3;
		
		e1 = new Addition(new Constant(2), new Constant(3));
		System.out.println(e1.Evaluate());
		
		e2 = new Mult(new Constant(1), new Constant(7));
		System.out.println(e2.Evaluate());
		
		e3 = new Addition(new Mult(new Addition(new Constant(2),
				new Constant(5)),
				new Mult(new Constant(8),
				new Constant(3))),
				new Addition(new Constant(1),
						new Constant(1)));
		System.out.println(e3.Evaluate());

	}

}
