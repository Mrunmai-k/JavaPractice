import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 3, 7, 2, 6);

        // fetch even no.s , double them, add them
        int sum = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                n *= 2;
                sum = sum + n;
            }
        }
        System.out.println(sum);

        // Ways to print the list
        System.out.println("Method 1");
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        System.out.println("Method 2");
        for (int no : nums) {
            System.out.println(no);
        }

        // forEach requires object of Consumer interface.
        // As this is a functional interface, we can write lambda expression.
        Consumer<Integer> con = n -> System.out.println(n);
        nums.forEach(con);

        System.out.println("Method 3");
        nums.forEach(n -> System.out.println(n));

        // So instead of creating a Consumer interface obj, we can simply write the
        // lambda exp code in forEach().
    }
}
