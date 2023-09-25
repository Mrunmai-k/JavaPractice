import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class SetDemo {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>(); // unsorted
        nums.add(10);
        nums.add(49);
        nums.add(76);
        nums.add(25);

        // for (int iterable_element : nums) {
        // System.out.println(iterable_element);
        // }

        // Set<Integer> noms = new TreeSet<Integer>(); // sorted
        // noms.add(1);
        // noms.add(4);
        // noms.add(7);
        // noms.add(2);

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}

// Set supports unique values
// Set will now give sorted value
// Set does not support index value
