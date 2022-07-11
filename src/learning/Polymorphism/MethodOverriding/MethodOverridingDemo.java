package learning.Polymorphism.MethodOverriding;

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle(10, 1);
		System.out.println("Bicycle gear is: " + bicycle.gear);
		System.out.println("Bicycle speed is: " + bicycle.speed);
		bicycle.applyBrake(1);
		System.out.println("Bicycle speed after applying break is: " + bicycle.speed);

		Bicycle mountainBike = new MountainBike(50, 50, 3);
		System.out.println("Mountain Bike gear is: " + mountainBike.gear);
		System.out.println("Mountain Bike speed is: " + mountainBike.speed);

		mountainBike.applyBrake(1);
		System.out.println("Mountain bike after applying break is: " + mountainBike.speed);

		mountainBike.applySpeed(10);
		System.out.println("Mountain bike speed after applying speed: " + mountainBike.speed);
	}

}
