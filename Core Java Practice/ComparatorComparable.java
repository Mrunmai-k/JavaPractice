import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentComparator {
    int age;
    String name;

    public StudentComparator(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

class StudentComparable implements Comparable<StudentComparable> {
    int age;
    String name;

    public StudentComparable(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentComparable [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(StudentComparable that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}

class ComparatorComparable {
    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(11);
        nums.add(45);
        nums.add(73);
        nums.add(29);

        Collections.sort(nums, comp); // sort on last digit of a number
        System.out.println(nums);

        // FunctionalInterface so write lambda expression with Ternary operator
        Comparator<StudentComparator> com = (i, j) -> i.age > j.age ? 1 : -1;
        // {
        // if (i.age > j.age)
        // return 1;
        // else
        // return -1;

        // };

        List<StudentComparator> studs = new ArrayList<StudentComparator>();
        studs.add(new StudentComparator(22, "Mrunmai"));
        studs.add(new StudentComparator(20, "Chetan"));
        studs.add(new StudentComparator(23, "Sangram"));

        Collections.sort(studs, com); // sort on ageStudentComparator
        for (StudentComparator student : studs) {
            System.out.println(student);
        }

    }
}

// Comparator is used to create own logic comparison and sorting.
// Either you can use comparator or you can implement comparable class.