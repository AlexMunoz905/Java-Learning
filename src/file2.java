public class file2 {
    static void myMethod() {
        System.out.println("This is method 1!");
    }

    static int myMethod2(int x) {
        return x;
    }

    public static void main(String[] args) {
        myMethod();
        System.out.println(myMethod2(5));
    }
}
