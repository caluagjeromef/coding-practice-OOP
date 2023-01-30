package ExtendAndImplement;

public class Man extends Person implements Human{
    int salary;

    public Man(int age, String name, int salary) {
        super(age, name);
        this.salary = salary;
    }

    @Override
    public void task() {
        System.out.println("Task is to reproduce");
    }
    public void showSalary(){
        System.out.println("The salary is: "+salary);
    }
}
