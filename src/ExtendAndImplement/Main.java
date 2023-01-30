package ExtendAndImplement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.next();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.print("Enter salary: ");
        int salary = input.nextInt();

        Man man = new Man(age,name,salary);

        man.showDetails();
        man.showSalary();
        man.task();

    }
}
