package learning.inheritanceDemo;

class Bicycle {
	protected int gear;
	protected int speed;

	public Bicycle(int startSpeed, int startGear) {
		speed = startSpeed;
		gear = startGear;
	}

	public void setGear(int newValue) {
		gear = newValue;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void seepUp(int increment) {
		speed += increment;
	}
}
