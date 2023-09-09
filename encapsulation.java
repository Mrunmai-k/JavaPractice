class Human {
    private int age = 22;
    private String name = "Mrunmai";

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }


    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.age = 22;
        // obj.name = "Mrunmai";
        obj.setAge(22);
        obj.setName("Mrunmai");

        // System.out.println(obj.age);

        System.out.println(obj.getName() +" : "+ obj.getAge());
    }
}
