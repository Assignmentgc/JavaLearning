import java.util.Scanner;

public class ArrayOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int max = arr[0];
        int evenSum = 0, oddSum = 0;
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
                evenCount++;
            } else {
                oddSum += arr[i];
                oddCount++;
            }
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Maximum number: " + max);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
        sc.close();
    }
}