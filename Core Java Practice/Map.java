import java.util.HashMap;
import java.util.Map;

class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Mrunmai", 89);
        students.put("Kiran", 56);
        students.put("Harsh", 78);
        students.put("Mrunmai", 92);

        System.out.println(students);

        System.out.println(students.keySet());
        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}

// Map is key-value pair
// Key cannot be repeated otherwise it will override the value.
// Values can be repeated
// HashMaps are not ordered
// Supports null keys and values