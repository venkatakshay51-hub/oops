public class rectangle {
    int length;
    int breadth;

    public rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        rectangle rect = new rectangle(10, 5);
        System.out.println("Area of rectangle: " + rect.area());
    }
}