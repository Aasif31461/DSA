import java.util.Scanner;

public class UserInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of inputs: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        int sum = 0;
        System.out.print("Enter the numbers : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
            sum += arr[i];
        }
        System.out.println("Sum of these numbers is :"+sum);
        sc.close();
    }
}