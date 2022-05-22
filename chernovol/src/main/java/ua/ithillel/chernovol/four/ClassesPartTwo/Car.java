package ua.ithillel.chernovol.four.ClassesPartTwo;

/**
 * @author Chernovol Alexander
 */

public class Car {
    Body body;
    Engine engine;
    Transmission transmission;

    public Car(Body body, Engine engine, Transmission transmission) {
        this.body = body;
        this.engine = engine;
        this.transmission = transmission;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public String toString() {
        return "Устройство Автомобиля: \n\t Тип кузова: " +
                body.getType() + "\n\t Материал кузова: " +
                body.getMaterial() + "\n\t Тип топлива: " +
                engine.getFuel() + "\n\t Тип охлаждения: " +
                engine.getCoolingMethod() + "\n\t Колличество цилиндров: " +
                engine.getCylindersAmount() + "\n\t Расположение циллиндров: " +
                engine.getCylindersArrangement() + "\n\t Тип подачи топлива: " +
                engine.getCombustibleMixtureIgnition() + "\n\t Трансмиссия: " +
                transmission.getDriveType() + "\n\t Тип трансмиссии: " +
                transmission.getGearboxType();
    }
}
