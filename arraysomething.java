public class arraysomething {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int[][] matrix1 = null;
		matrix1 = new int[3][4];
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("Read a value for matrix["+i+"]["+j+"] : ");
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Given Matrix1");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Given Matrix2");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}