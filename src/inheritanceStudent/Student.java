package inheritanceStudent;

import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    String name;
    int marks;

    public void getDetails(){
        System.out.print("Enter student's name: ");
        name = scanner.nextLine();
        System.out.print("Enter student's mark: ");
        marks = scanner.nextInt();
    }

    public void showDetails(){
        System.out.println("Name: "+name
                +"\n"+"Mark of the student: "+marks);
    }
}
