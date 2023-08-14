import java.util.Arrays;
public class ArrayTest {
    public static void main (String[] args) {
        int[] array = {12,5,19,43,2,8};
        //int arrayLength = array.length;
        Arrays.stream(array).forEach(n -> System.out.print(n + " "));
        Arrays.parallelSort(array);
        System.out.println("");
        Arrays.stream(array).forEach(n -> System.out.print(n + " "));
    }
}
