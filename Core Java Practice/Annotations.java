class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in A long show");
    }
}

class B extends A {
    /*
     * There is a slight change in method name, class A's name contains 'Belongs'
     * whereas class B's name contains Belong. But what we wanted to do was to
     * override the method. That's when the override annotation can be used to
     * simply just tell the compiler that we want to override the method.
     */
    
    @Override
    public void showTheDataWhichBelongsToThisClass(){

    }
    public void showTheDataWhichBelongToThisClass() {
        System.out.println("in B long show");
    }
}

public class Annotations {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass(); // in A long show
    }
}
