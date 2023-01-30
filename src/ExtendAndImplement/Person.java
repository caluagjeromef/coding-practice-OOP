package ExtendAndImplement;

public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void showDetails(){
        System.out.println("The name is: "+name);
        System.out.println("The age is: "+age);
    }
}
