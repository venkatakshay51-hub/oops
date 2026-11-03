public class DivisibleCheck {
    public static void main(String[] args) {

        int n = 221;

        if (n % 13 == 0 && n % 17 == 0) {
            System.out.println("221 is divisible by 13 and 17");
        } 
        else {
            System.out.println("221 is not divisible by 13 and 17");
        }
    }
}