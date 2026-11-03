public class FinallyDemo {
    static void display() {
        try {
            System.out.println("Inside try block");
            return;
        } finally {
            System.out.println("I am Inevitable");
        }
    }

    public static void main(String[] args) {
        display();
    }
}