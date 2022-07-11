package learning.nestedClassesDemo;

public class InnerClassesDemo {

	public static void main(String[] args) {
		OuterClass.InnerClass in=new OuterClass().new InnerClass();
		in.display();
		
		OuterClass out = new OuterClass();
		out.outerClassMethod();

	}

}
