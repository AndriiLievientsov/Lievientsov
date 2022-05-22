package ua.ithillel.Lievientsov.HomeworkFive.PartTwo;

//9. В `main` создать объект класса `Car` при этом необходимо создать объекты всех полей,
// из которых состоит `Car`.

public class Main {
    public static void main(String[] args) {
        Body body = new Body("Sedan", "Сarbon");
        Engine engine = new Engine(
                "Gas",
                "Oil cooling",
                4,
                "W-shaped",
                "Carburetor");
        Transmission transmission = new Transmission("Manual", "Tapered");
        Car car = new Car(body, engine, transmission);
        System.out.println(car);
    }
}
