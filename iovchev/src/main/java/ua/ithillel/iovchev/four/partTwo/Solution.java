package ua.ithillel.iovchev.four.partTwo;

    /* 9. В `main` создать объект класса `Car` при этом необходимо создать объекты всех полей, из которых состоит `Car`.*/

public class Solution {
    public static void main(String[] args) {
        Body body = new Body("sedan".toCharArray(), "steel".toCharArray());
        Engine engine = new Engine("gasoline".toCharArray(), "liquid".toCharArray(), "W-engine".toCharArray(),
                "Homogeneous distribution".toCharArray(), 8);
        Transmission transmission = new Transmission("4x4".toCharArray(), "automatic".toCharArray());

        Car car = new Car(body, engine,  transmission);

    }
}
