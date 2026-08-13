class ArrayDemo {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int[] marks = null;

		marks = new int[10];

		for(int i=0;i<10;i++) {
		    System.out.print("Read for marks["+i+"] :: ");
		    marks[i] = sc.nextInt();
		}

		System.out.print("Marks are :: ");
		for(int i=0;i<10;i++) {
		    System.out.print(marks[i] + "  ");
		}
	}
}