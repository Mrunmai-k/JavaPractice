public class array {
    public static void main(String[] args) {
        int num[] = { 4, 7, 3, 2 };
        num[1] = 6;
        int value = 1;
        // System.out.println(num[2]);

        int dynamic[] = new int[4];

        for (int i = 0; i < dynamic.length; i++) {
            dynamic[i] = value;
            value++;
        }
        System.out.println("Dynamic Array");
        for (int i = 0; i < dynamic.length; i++) {
            System.out.print(dynamic[i] + " ");
        }

        System.out.println("\nMulti-dimensional Array");

        // Multi-dimensional array

        int nums[][] = new int[3][4];
        // int rand = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Optimized loop for array traversing
        // foreach loop
        for (int i[] : nums) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
