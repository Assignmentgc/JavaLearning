import java.util.Scanner;
class utility {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("1. Sum of Digits");
    System.out.println("2. Reverse Number");
    System.out.println("3. Check Palindrome");
    System.out.println("4. Check Prime");
    
    System.out.print("Enter choice: ");
    int choice = input.nextInt();
    
    System.out.print("Enter number: ");
    int num = input.nextInt();
    
    if (choice == 1) {
        int result = sumOfDigits(num);
        System.out.println("Result: " + result);
    }
    if (choice == 2) {
        int result = reverse(num);
        System.out.println("Result: " + result);
    }
    if (choice == 3) {
        boolean result = isPalindrome(num);
        if (result == true) {
            System.out.println(num + " is a palindrome");
        }
        if (result == false) {
            System.out.println(num + " is not a palindrome");
        }
    }
    if (choice == 4) {
        boolean result = isPrime(num);
        if (result == true) {
            System.out.println(num + " is prime");
        }
        if (result == false) {
            System.out.println(num + " is not prime");
        }
    }
}
static int sumOfDigits(int num) {
    int sum = 0;
    while (num > 0) {
        sum += num % 10;
        num /= 10;
    }
    return sum;
}
static int reverse(int num) {
    int reversed = 0;
    while (num > 0) {
        reversed = reversed * 10 + num % 10;
        num /= 10;
    }
    return reversed;
}
static boolean isPalindrome(int num) {
    return num == reverse(num);
}
static boolean isPrime(int num) {
    if (num <= 1) return false;
    if (num == 2) return true;
    if (num % 2 == 0) return false;
    for (int i = 3; i * i <= num; i += 2) {
        if (num % i == 0) return false;
    }
    return true;
}
}