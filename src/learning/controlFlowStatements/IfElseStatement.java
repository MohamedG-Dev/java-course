package learning.controlFlowStatements;

public class IfElseStatement {

	public static void main(String[] args) {
		int testScore = 70;
		char grade;
		
		if(testScore>=90) {
			grade='A';
		}else {
			grade = 'F';
		}
		System.out.println(grade);

	}

}
