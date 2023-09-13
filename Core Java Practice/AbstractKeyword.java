abstract class Car // abstract class
{
    public abstract void drive();

    public void playMusic() {
        System.out.println("play music");
    }
}

class WagonR extends Car // concrete class
{
    public void drive() {
        System.out.println("Driving");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
    }
}

// If you don't know the implementation of the method instead of keeping it
// blank, so declare the function don't define it.

// abstract concept means you only know that drive function should be there in
// car but don't know ho to implement it.

// The abstract method can only be defined by an abstract class
// The object of abstract class is cannot be created, but we can create ref of
// abstract class.
// Extended class should define all the abstract methods declared in abstract class. 
// Abstract class can have only non-abstract methods or only abstract methods or both.
