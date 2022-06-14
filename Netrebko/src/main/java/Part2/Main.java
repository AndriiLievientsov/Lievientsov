package Part2;

public class Main {
    public static void main(String[] args) {
        Body b = new Body("sedan" , "still");
        Engine e = new Engine("petrol" ,"antifreeze" , 5 ,"row", "candles");
        Transmission t =new Transmission("moderate" , "automatic");
        Car c = new Car(b, e, t);

    }
}
