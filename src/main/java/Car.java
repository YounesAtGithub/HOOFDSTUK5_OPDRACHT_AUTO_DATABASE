public class Car {
    String brand;
    String model;
    int year;
    String color;
    String engineSize;

    public Car(String brand, String model, int year, String color, String engineSize) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineSize = engineSize;
    }

    public void carFactsPrinter() {
        System.out.println("Deze " + brand + " " +  model + " heeft de kleur "+ color + " en bouwjaar is " + year + " en heeft een cilinderinhoud van " + engineSize);
    }
}
