public class loops {
    public static void main(String[] args) {
        // switch
        int num = 2;
        switch (num) {
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            default:
                System.out.println(num);
        }

        // for loop
        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum = sum + j;
        }
        System.out.println("The sum of first 10 natural numbers is " + sum);

        String[] names = { "Java", "C", "C++", "Python", "JavaScript" };
        System.out.println("Printing the content of the array names:\n");
        for (String name : names) {
            System.out.println(name);
        }

        // while loop
        int i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        while (i <= 10) {
            System.out.println(i);
            i = i + 2;
        }

        // do-while loop
        i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        do {
            System.out.println(i);
            i = i + 2;
        } while (i <= 10);
    }
}
