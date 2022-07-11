package learning.nestedClassesDemo;

class MoutainBike implements Bicycle{

	@Override
	public void canApplyBrake() {
		System.out.println("can apply brake on the moutain bike");
	}

	@Override
	public void canSpeedUp() {
		System.out.println("can speed up the mountain bike");
	}

}
