public class Main {
    printCarInfo();

    public static void main(String[] args) {
        car fiat = new car("Fiat", "500", 2019, "Groen", 1.4);
        car toyota = new car("Toyota", "Aygo", 2016, "Blauw", 1.2);
        car volvo = new car("Volvo", "CX90", 2022, "Zwart", 2.0);
    }

    public static void printCarInfo() {
        System.out.println("Deze" + brand + model + " is " + color);
    }
}
