package learning.Arrays;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		int[][][] arr= {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[1][0].length);
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr[1].length;j++) {
				for(int k=0;k<arr[j][0].length;k++) {
					System.out.print(" "+arr[i][j][k]);
				}
				System.out.println();
			}
		}

	}

}
