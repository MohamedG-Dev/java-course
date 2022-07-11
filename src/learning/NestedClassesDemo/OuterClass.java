package learning.NestedClassesDemo;

public class OuterClass {

	class InnerClass {
		public void display() {
			System.out.println("This is a inner class method");
		}
	}

	void outerClassMethod() {
		System.out.println("Inside the Outer Class Method");

		class MethodLocalClass {
			void localInnerMethod() {
				System.out.println("Inside the method of local method class");
			}
		}
		MethodLocalClass mlc = new MethodLocalClass();
		mlc.localInnerMethod();
	}
}
