package inheritanceCar;

public class Car extends Vehicle {
    String color;
    int model;

    public Car(int cost, int mileage, String color, int model) {
        super(cost, mileage);
        this.color = color;
        this.model = model;
    }

    public void showDetails(){
        System.out.println("Car Details: ");
        System.out.println("Car color: "+color);
        System.out.println("Car model: "+model);
    }
}
