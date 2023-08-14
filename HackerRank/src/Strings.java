import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();

        System.out.println(a.length() + b.length());

        int alphabeticalCompare = a.compareTo(b);
        if (alphabeticalCompare <= 0) {
            // A is alphabetically less than B
            System.out.println("No");
        } else {
            // A is alphabetically greater than B
            System.out.println("Yes");
        }

        a = a.substring(0,1).toUpperCase() + a.substring(1);
        b = b.substring(0,1).toUpperCase() + b.substring(1);
        System.out.println(a + " " + b);
    }
}
