package ch.mdpdes.demo.strategy;

public class BMW extends Car{

	@Override
	public String getDescription() {
		return "BMW";
		
	}

	@Override
	public double cost() {
		
		return 75000.00;
	}
		
}
