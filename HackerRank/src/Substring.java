import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int a = scan.nextInt();
        int b = scan.nextInt();
        s = s.substring(a, b);
        System.out.println(s);
    }
}
