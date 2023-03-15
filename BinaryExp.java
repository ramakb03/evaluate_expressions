package Expression;

public abstract class BinaryExp implements Expression {
	//an abstract class has methods that aren't implemented and some that are. It's a hybrid between an interface and a class.
	
	protected Expression lhs; //allow other methods to change it
	protected Expression rhs;
	
	public BinaryExp(Expression lhs, Expression rhs) {
		
		this.lhs = lhs;
		this.rhs = rhs;
	}
	public Expression getLHS() {
		return lhs;
	}
	public Expression  getRHS() {
		return rhs;
	}
	public abstract int Evaluate();
	//a method is abstract when it doesn't have a body, which means it isn't implemented
}
