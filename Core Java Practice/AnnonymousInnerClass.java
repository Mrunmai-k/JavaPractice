class AAInner {
    int age;

    public void show() {
        System.out.println("in A show()");
    }
}

/*
 * class BAInner extends AAInner {
 * public void show() {
 * System.out.println("in B show");
 * }
 * }
 */

// BAInner class is only used for overriding the show method of AAInner class.
// So there is no need to create a separate class when you are going to use this
// only once. Then why to create a new class? So comment out above class.

public class AnnonymousInnerClass {
    public static void main(String[] args) {
        AAInner obj = new AAInner() {
            public void show() {
                System.out.println("in new show()");
            }
        };
        obj.show();
    }
}
