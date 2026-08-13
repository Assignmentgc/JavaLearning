public class Utility {

	public static int sumOfDigits(int n){
		int sum=0;
		while(n!=0) {
			int rem = n%10;
			sum = sum + rem;
			n=n/10;
		}
		return sum;
	}
	
	public static int reverse(int n){
		int rev = 0;
		while(n != 0) {
			int rem = n%10;
			rev = rev * 10+ rem;
			n = n/10;
		}
		return rev;
	}
	
	public static boolean isPalindrome(int n){ //1234
		return n == reverse(n);
	}
	
	public static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Sum of digits of 1234 = "+sumOfDigits(1234));
		
		System.out.println("Reverse of 12345 = "+reverse(12345));
		
		int n=12321;
		if(isPalindrome(n))
			System.out.println(n+" is palindrome");
		else
			System.out.println(n+" is not palindrome");
		
		n=7;
		if(isPrime(n))
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
	}

}