package ch.mdpdes.demo.strategy;

public class Smart extends Car{

	@Override
	public String getDescription() {
		return "Smart";
		
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 10000.00;
	}
		
}
