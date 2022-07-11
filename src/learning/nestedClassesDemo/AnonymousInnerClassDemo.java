package learning.nestedClassesDemo;

public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		Bicycle mountainBike = new MoutainBike();
		mountainBike.canApplyBrake();
		mountainBike.canSpeedUp();
		System.out.println();
		Bicycle bicycle = new Bicycle() {

			@Override
			public void canSpeedUp() {
				System.out.println("can speed up the Bicyle");

			}

			@Override
			public void canApplyBrake() {
				System.out.println("can apply break on Bicycle");
			}
		};
		bicycle.canApplyBrake();
		bicycle.canSpeedUp();
	}

}
