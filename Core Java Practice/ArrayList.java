import java.util.ArrayList;
import java.util.List;

class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(4);
        nums.add(7);
        nums.add(2);

        System.out.println(nums.get(2)); // this will return the value at second index position.
        System.out.println(nums.indexOf(4)); // this will return the index of value 4.

        // for (int n : nums) {
        //     System.out.println(n);    
        // }
    }
}

// List allows the duplicate values
