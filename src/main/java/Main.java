public class Main {


    public static void main(String[] args) {
        Car volvo = new Car("Volvo", "CX90", 2022, "zwart", "2.0");
        Car toyota = new Car("Toyota", "Aygo", 2006, "Blauw", "1.2");
        Car fiat = new Car("Fiat", "500", 2019, "Groen", "1.4");
        System.out.println(volvo.brand + " " + volvo.model);
        System.out.println(toyota.brand + " " + toyota.model + " " + toyota.year + " " + toyota.color + " " + toyota.engineSize);


        Car printer = new Car("Tesla", "Model3", 2020, "Midnight Grey", "0");
        printer.carFactsPrinter();
    }



}
