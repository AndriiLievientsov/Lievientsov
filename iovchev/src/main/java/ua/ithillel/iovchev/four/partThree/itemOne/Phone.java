package ua.ithillel.iovchev.four.partThree.itemOne;


public class Phone {

    private String number;
    private String model;
    private double weight;

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + ", номер " + number);
    }

    String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(String number, String model) {
        this(number, model, 200.0);
    }

    public Phone() {
    }

    void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println(number);
        }

    }

}