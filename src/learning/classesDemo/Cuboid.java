package learning.classesDemo;

public class Cuboid {
	int height;
	int width;
	int depth;

	public Cuboid(int height, int width, int depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	public Cuboid(int height, int width) {
		this.height = height;
		this.width = width;
		this.depth = 10;
	}

	public Cuboid(int height) {
		this.height = height;
		this.width = 12;
		this.depth = 15;
	}

	public Cuboid() {
		this.height = 10;
		this.width = 10;
		this.depth = 10;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	int volume() {
		return height * width * depth;
	}

	public static void main(String[] args) {
		int volume;

		Cuboid stdCuboid = new Cuboid(10, 20, 15);
		volume = stdCuboid.volume();
		System.out.println("The volume of the simple cuboid is: " + volume);

		Cuboid cuboidWithDefaults = new Cuboid(10, 20);
		volume = cuboidWithDefaults.volume();
		System.out.println("The volume of the simple cuboid with default depth is: " + volume);

		Cuboid cube = new Cuboid(10);
		volume = cube.volume();
		System.out.println("The volume of the simple cube is: " + volume);

		Cuboid defaultCuboid = new Cuboid();
		volume = defaultCuboid.volume();
		System.out.println("The volume of the simple cuboid with default values is: " + volume);
	}

}
