import java.util.Scanner;
public class SomeSwitchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Number is one");
                break;
            case 2:
                System.out.println("Number is two");
                break;
            case 3:
                System.out.println("Number is three");
                break;
            default:
                System.out.println("Number is not one, two, or three");
        }
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }
}