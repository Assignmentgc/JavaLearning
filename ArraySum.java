class ArraySum {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("How many element would you like to read? ");
		int n = sc.nextInt();//10
		
		//int[] arr = null;
		//arr = new int[n];

		int[] arr = new int[n];

		int sum = 0, esum = 0, osum = 0;
        int ecount = 0, ocount = 0;
		for(int i=0;i<n;i++) {
		    System.out.print("Read a value for arr["+i+"]: ");
		    arr[i] = sc.nextInt(); //5 3 2 1 6 8 9 ...
		    sum = sum + arr[i];

            if(arr[i]%2==0) {
                esum = esum + arr[i];
                ecount++;
            } else {
                osum = osum + arr[i];
                ocount++;
            }
		}



		System.out.print("Elements are :: ");
		for(int i=0;i<n;i++) {
		   System.out.print(arr[i]+" ");
		}

		System.out.println("\nSum="+sum);
        System.out.println("Even sum = " +esum);
        System.out.println("Odd sum = " +osum);
        System.out.println("No of even numbers ="+ecount);
        System.out.println("No of odd numbers ="+ocount);


	}
}