class PersonIdentify {
    public static void main(String[] args) {

        int age = 25;

        if (age > 3 && age < 13) {
            System.out.println("Child");
        }
        else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        }
        else if (age > 19 && age <= 40) {
            System.out.println("Major");
        }
        else if (age > 40 && age <= 60) {
            System.out.println("Matured");
        }
        else if (age > 60 && age <= 100) {
            System.out.println("Senior citizen");
        }
        else {
            System.out.println("Baby");
        }
    }
}