package ch.mdpdes.demo.strategy;

public class NaviSystem extends CarInterior{

	Car car;
	
	public NaviSystem(Car car){
		this.car = car;
	}
	
	@Override
	public String getDescription() {
		return car.getDescription() + ", NaviSystem";
	}

	@Override
	public double cost() {
		return 500 + car.cost();
		
		
	}

}
