package Expression;

public class Constant implements Expression {
	private int number;
	
	public Constant (int number){
		this.number = number;
	}
	public int Evaluate() {
		return number;
	}

}
