public class animal {
    void eat() {
        System.out.println("Animal eating...");
    }
}

class Dog extends animal {
    void bark() {
        System.out.println("Dog barking...");
    }
}

class TestInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.bark();
        d.eat();
    }
}
    

