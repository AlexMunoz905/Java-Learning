public class checkAge {
    static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("You can vote!");
        } else if (age == 17) {
            System.out.println("You are one year away from voting!");
        } else {
            System.out.println("You can't vote!");
        }
    }

    public static void main(String[] args) {
        checkAge(25);
    }
}
