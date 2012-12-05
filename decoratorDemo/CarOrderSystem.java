package ch.mdpdes.demo.strategy;

public class CarOrderSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new Smart();
		
		
		System.out.println("Folgendes Auto wurde gewaehlt: " + car.getDescription() + " Kostet in ihrer Konfiguration: " + car.cost());
		
		Car car2 = new BMW();
		car2 = new NaviSystem(car2);
		car2 = new SeatHeating(car2);
		
		System.out.println("Folgendes Auto wurde gewaehlt: " + car2.getDescription() + " Kostet in ihrer Konfiguration: " + car2.cost());

	}

}
