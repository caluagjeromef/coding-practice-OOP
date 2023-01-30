package inheritanceCar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("[[Vehicle details]]");
        System.out.print("Cost of Vehicle: ");
        int vehicleCost = input.nextInt();
        System.out.print("Mileage of Vehicle: ");
        int vehicleMileage = input.nextInt();
        System.out.print("Color of Vehicle: ");
        String vehicleColor = input.next();
        System.out.print("Model of Vehicle: ");
        int vehicleModel = input.nextInt();

        Car car = new Car(vehicleCost,vehicleMileage,vehicleColor,vehicleModel);

        car.vehicleDetails();
        car.showDetails();
    }
}
