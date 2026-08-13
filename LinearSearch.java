class LinearSearch {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
	
		int[] arr = {7,1,9,12,4,6,8,2,3,15};
			
		System.out.print("Elements are :: ");
		for(int element : arr)
		   System.out.print(element+" ");

		System.out.print("\nRead an element to be searched :: ");
		int sitem = sc.nextInt(); //12

		System.out.println("Item to be searched :: "+sitem);

		boolean isFound = false;

		for(int i=0;i<arr.length;i++) {
		    if(arr[i] == sitem){
			System.out.print(sitem+" found at index :: "+i);
			isFound = true;
			break;
		    }
		}
		if(!isFound)
		   System.out.println(sitem+" does not exist");
		
	}
}