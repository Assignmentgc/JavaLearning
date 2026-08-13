public class AdditionMatrix {

	public static void main(String[] args) {
		int[][] matrix1 = {{1,2,3},{5,3,4},{3,4,5}};
		int[][] matrix2 = {{3,1,2},{4,2,3},{5,3,2}};
		
		System.out.println("First matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose of First matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix1[j][i]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("Second matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] matrix3 = new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		
		System.out.println("Resultant matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
		boolean isSymmetric = true;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(matrix1[i][j] != matrix1[j][i]) {
					isSymmetric = false;
					break;
				}
			}
			if(!isSymmetric)
				break;
		}
		
		if(isSymmetric)
			System.out.println("It is symmetric");
		else
			System.out.println("It is not symmetric");
		
	}

}