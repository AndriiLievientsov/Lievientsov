package ua.ithillel.natochin.four.partthree.phone;


public class Phone {
    private String number;
    private String model;
    private Double weight;

    public Phone(){
        this("unknown", "noname", 0.0);
    }
    public Phone(String number, String model){
        this(number, model, 0.0);
    }
    public Phone (String number, String model, Double weight){
        this.number = number;
        this.model = model;
        this.weight  = weight;
    }

    public void receiveCall(String name){
        System.out.println(name + " is calling.");
    }

    public void receiveCall(String name, String telNumber){
        this.receiveCall(name);
        System.out.println("Number " + telNumber);
    }

    public String getNumber(){
        return this.number;
    }

    public void sendMessage(String ... telNums){
        for(String telNum : telNums){
            System.out.println(telNum);
        }
    }

    @Override
    public String toString(){
        if (this.weight == 0.0){
            return "phone: " + this.model + ", number: " + this.getNumber();
        }
        return "phone: " + this.model + ", number: " + this.getNumber() + ", weight: " + this.weight + "grams.";
    }
}
