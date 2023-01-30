package inheritanceMultiLevel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.next();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.print("Enter gender: ");
        String gender = input.next();

        GrandChild grandChild = new GrandChild(name,age,gender);
        grandChild.showName();
        grandChild.showAge();
        grandChild.showGender();

    }
}
