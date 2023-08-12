/*
    Learning Java
    8/8/2023
    Alex Munoz
 */
public class main {
    public static void main(String[] args) {
        // Print Hello World
        System.out.println("Hello, World!");
        System.out.println("Test");
        // print doesn't make a new line aka \n
        System.out.print("this does NOT make a new line \n");
        System.out.println(500);
        System.out.println(5*2);

        // Variables
        // Variables are cAsE sensitive! IE myName and MyName are different.
        String myName = "Alex Munoz";
        int randomNumber = 1234;
        System.out.println("My name is: " + myName);
        System.out.println(randomNumber);
        randomNumber = 5678;
        System.out.println(randomNumber);
        // Final mean variable is not able to be changed.
        final String color = "red";
        System.out.println(color);

        int x = 1, y = 2, z = 3;
        System.out.println(x + y + z);

        // Floating Numbers
        float floatNum = 3.14f;
        // Char's AKA only one character
        char charLetter = 'A';
        // Booleans, true or false only
        boolean myBoolean = true;

        String firstName = "Alex ";
        String lastName = "Munoz";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        System.out.println(firstName + lastName);

        System.out.println(x > y);

        // Messing with Strings
        String testString1 = "Test String 1";
        System.out.println(testString1.length());
        System.out.println(testString1.toUpperCase());
        System.out.println(testString1.toLowerCase());
        // Find character in a String
        System.out.println(testString1.indexOf("String"));
        // Concatenation
        System.out.println(firstName.concat(lastName));

        // Math
        x = 64;
        y = 50;
        /*
            Max = maximum value of given variables
            Min = minimum value of given variables
            Sqrt = square root of given variable
            Abs = absolute positive value of given variable
            Random = random number between 0.0 and 1.0, hence * 101
         */
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.sqrt(x));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random());
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);

        // Booleans
        int randomAge = 25;
        int votingAge = 18;
        if (randomAge >= votingAge) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote!");
        }

        // Arrays
        String[] cars = {"Toyota", "Honda", "Ford"};
        cars[2] = "BMW";
        System.out.println(cars[2]);
        System.out.println(cars.length);
    }
}