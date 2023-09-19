import java.io.*;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number:");

        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            int num1 = Integer.parseInt(br.readLine());
            System.out.println(num1);
        }

        finally {
            br.close();
        }

        // we can optimize the above code using try-with-resources, where no need to
        // write finally block.
        System.out.println("Enter a string: ");

        try (Scanner sc = new Scanner(System.in))
        // this creates the object in try() and closes the objects after the try ends
        {
            String str = sc.nextLine();
            System.out.println(str);
        }
    }
}

// println() is the method of PrintStream class so to use it we need to create
// object of PrintStream class.
// But Java has already created a object named 'out' of PrintStream class in the
// System class. = out.println()
// As 'out' is static we need to call it using System class. = System.out