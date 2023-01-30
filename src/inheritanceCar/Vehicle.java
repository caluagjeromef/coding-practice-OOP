package inheritanceCar;

public class Vehicle {
    int cost;
    int mileage;

    public Vehicle(int cost, int mileage) {
        this.cost = cost;
        this.mileage = mileage;
    }

    public void vehicleDetails(){
        System.out.println("Car details: ");
        System.out.println("Car cost: "+cost);
        System.out.println("Car mileage: "+mileage);
    }
}
