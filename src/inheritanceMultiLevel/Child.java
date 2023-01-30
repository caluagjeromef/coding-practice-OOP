package inheritanceMultiLevel;

public class Child extends Parent{
    int age;

    public Child(String name, int age) {
        super(name);
        this.age = age;
    }

    public void showAge(){
        System.out.println("Age is: "+age);
    }
}
