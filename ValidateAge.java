public class ValidateAge {
    static void ValidateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Access denied: under 18");
        }

        System.out.println("Access granted");
    }

    public static void main(String[] args) {
        ValidateAge(20);
    }
}