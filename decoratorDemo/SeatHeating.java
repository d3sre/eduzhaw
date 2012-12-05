package ch.mdpdes.demo.strategy;

public class SeatHeating extends CarInterior {

	Car car;
	
	public SeatHeating(Car car){
		this.car = car;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return car.getDescription() + ", SeatHeating";
	}

	@Override
	public double cost() {
		return 1500 + car.cost();
		
		
	}

}
