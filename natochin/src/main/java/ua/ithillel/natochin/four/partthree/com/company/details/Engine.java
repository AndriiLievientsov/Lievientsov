package ua.ithillel.natochin.four.partthree.com.company.details;

public class Engine {
    private int power;
    private String producer;

    public Engine (int power, String producer){
        this.power = power;
        this.producer = producer;
    }

    @Override
    public String toString(){
        return "brand: " + this.producer + "; power: " + this.power + " h.p.";
    }
}
