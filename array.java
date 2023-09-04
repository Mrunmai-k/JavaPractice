public class array {
    public static void main(String[] args) {
        int num[] = {4,7,3,2};
        num[1] = 6;
        
        System.out.println(num[2]);

        int dynamic[] = new int[4];

        for (int i = 0; i < dynamic.length; i++) {
            System.out.println(dynamic[i]);    
        }
        

    }
}
