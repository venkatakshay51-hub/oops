public class ArrayException {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};

        try {
            for (int i = 0; i <= 7; i++) {
                System.out.println(a[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        }
    }
}