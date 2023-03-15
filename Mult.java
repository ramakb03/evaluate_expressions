package Expression;

public class Mult extends BinaryExp {

	public Mult(Expression lhs, Expression rhs) {
			super(lhs, rhs);
			}
		public int Evaluate() {
			//base case is when the expression is a constant so we don't need to write it 
			return lhs.Evaluate() * rhs.Evaluate();
		}
}
