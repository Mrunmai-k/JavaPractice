// @FunctionalInterface
interface A {
    // void show(int i); // This is the single abstract method
    int add(int i, int j);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        // A obj = new A() {
        //     // public void show() {
        //     // System.out.println("in show");
        //     // }
        //     public int add(int i, int j) {
        //         return i+j;
        //     }
        // };
        
        // //obj.show();
        // obj.add(5, 4);

        /*
         * in above annonymous class
         * new A(){
         * public void show()
         * is common so why write it.
         */

        // Lambda expression
        /*A obj1 = i -> // there is no need to mention the parameter type as we have already mentioned
                      // while declaring it.
        {
            System.out.println("in show");
            System.out.println();
        };
        obj1.show(5);*/

        //No need to write return keyword when there is a single line code
        A obj = (i,j) ->  i+j;
        obj.add(5, 4);
        

        // // For single line code
        // A obj2 = () -> System.out.println("in show");

        // obj2.show();
    }
}

/*
 * Functional interface means only one method defined in interface. Which is
 * also called Single Abstract Method.
 */
// Lambda Expressions only works with functional interface.
