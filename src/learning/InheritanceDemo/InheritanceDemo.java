package learning.InheritanceDemo;

public class InheritanceDemo {
	public static void main(String[] args) {
		MountainBike mountainBike = new MountainBike(20, 10, 1);
		System.out.println("The Gear is: " + mountainBike.gear);
		System.out.println("Seat Height is: " + mountainBike.seatHeight);
		System.out.println("Bike speed is: " + mountainBike.speed);

		mountainBike.applyBrake(1);
		System.out.println("Bike speed after applying brake is: " + mountainBike.speed);
	}
}
