package learning.interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {
		MountainBike bike = new MountainBike(20, 10, 1);
		System.out.println("Gear is: " + bike.getGear());
		System.out.println("Seat Height is: " + bike.getSeatHeight());
		System.out.println("Bike speed is: " + bike.getSpeed());

		bike.applyBrake(1);
		System.out.println("Speed of the bike after applying the brake is: " + bike.getSpeed());

		bike.speedUp(10);
		System.out.println("Speed of the bike after incerementing speed is: " + bike.getSpeed());
	}

}
