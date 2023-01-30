package interfacePhone;

public class Oppo implements Phone{
    @Override
    public void cost() {
        System.out.println("Cost is 10,000");
    }

    @Override
    public void color() {
        System.out.println("Color is black and white");
    }

    @Override
    public void RAM() {
        System.out.println("RAM is 8GB");
    }
}
