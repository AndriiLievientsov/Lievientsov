package ua.ithillel.Lievientsov.HomeworkFive.PartTwo;

//7. Создать класс `Car`.
//8. В класс `Car` добавить:
//   - Поля: `body (Body)`, `engine (Engine)`, `transmission (Transmission)`.
//   - Конструктор, который принимает все свойства класса.
//   -  `getter`-ы для всех полей.

public class Car {
    private Body body;
    private Engine engine;
    private Transmission transmission;

    public Car(Body body, Engine engine, Transmission transmission) {
        this.body = body;
        this.engine = engine;
        this.transmission = transmission;
    }

    public Body getBody() {
        return body;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    @Override
    public String toString() {
        return "Vehicle description: " + "\n" +
                "Body type: " + body.getType() + "\n" +
                "Body Material: " + body.getMaterial() + "\n" +
                "Fuel type: " + engine.getFuel() + "\n" +
                "Cooling Method: " + engine.getCoolingMethod() + "\n" +
                "Cylinders Amount: " + engine.getCylindersAmount() + "\n" +
                "Cylinders Arrangement: " + engine.getCylindersArrangement() + "\n" +
                "Combustible Mixture Ignition: " + engine.getCombustibleMixtureIgnition() + "\n" +
                "Drive Type: " + transmission.getDriveType() + "\n" +
                "Gearbox Type: " + transmission.getGearboxType();
    }
}
