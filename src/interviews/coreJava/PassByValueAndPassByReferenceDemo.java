package interviews.coreJava;

public class PassByValueAndPassByReferenceDemo {
	int value;

	public static void main(String[] args) {
		PassByValueAndPassByReferenceDemo object = new PassByValueAndPassByReferenceDemo();
		object.value = 5;
		objectReference(object);// Pass By reference example but still it's pass by value cuz we are passing
								// objectReference as a value
		System.out.println(object.value);

		int a = 3;
		changePrimitives(a);// Pass By value example

	}

	public static void changePrimitives(int aCopyValue) {
		aCopyValue = 14;
		System.out.println(aCopyValue);
	}

	public static void objectReference(PassByValueAndPassByReferenceDemo object) {
		object.value = 25;
	}

}
