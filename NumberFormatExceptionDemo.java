import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String age = sc.nextLine();

        try {
            int a = Integer.parseInt(age);
            System.out.println("Age: " + a);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }

        sc.close();
    }
}