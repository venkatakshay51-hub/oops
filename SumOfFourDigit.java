import java.util.Scanner;

public class SumOfFourDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a four-digit number: ");
        int n = sc.nextInt();

        int sum = (n / 1000)
                + (n / 100 % 10)
                + (n / 10 % 10)
                + (n % 10);

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}