import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 3, 7, 2, 6);

        // Trying to use below even no. code with stream methods.
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); // s2 will only contain even no.s now
        Stream<Integer> s3 = s2.map(n -> n * 2); // double the even no.s
        int result = s3.reduce(0, (c, e) -> c + e); // adds the no.s
        System.out.println(result);

        // We can all write this in this way
        int addition = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(addition);

        // fetch even no.s , double them, add them
        int sum = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                n *= 2;
                sum = sum + n;
            }
        }
        System.out.println(sum);

        /*
         * // Ways to print the list
         * System.out.println("Method 1");
         * for (int i = 0; i < nums.size(); i++) {
         * System.out.println(nums.get(i));
         * }
         * 
         * System.out.println("Method 2");
         * for (int no : nums) {
         * System.out.println(no);
         * }
         * 
         * // forEach requires object of Consumer interface.
         * // As this is a functional interface, we can write lambda expression.
         * Consumer<Integer> con = n -> System.out.println(n);
         * nums.forEach(con);
         * 
         * System.out.println("Method 3");
         * nums.forEach(n -> System.out.println(n));
         * 
         * // So instead of creating a Consumer interface obj, we can simply write the
         * // lambda exp code in forEach().
         */
    }
}

// Using the stream we can perform the operations on nums with affecting it.
// Once you used the stream you cannot reuse it.
// Stream is like BigData, where we remove noise(unwanted data), then map-reduce