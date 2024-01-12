public class SuperCar extends Car {
    public long price;

    SuperCar(String brand, double topSpeed, String name, int wheel, String color, long price) {
        super(brand, topSpeed, name, wheel, color);
        this.price = price;
    }
}