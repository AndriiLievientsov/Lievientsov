package ua.ithillel.natochin.four.partthree.animal;

public class Animal {
    private String food;
    private String location;

    public Animal (String food, String location){
        this.food = food;
        this.location = location;
    }
    public void makeNoise(){
        System.out.println(this + " eating " + this.food);
    }

    public void eat() {
        System.out.println(this + " eating " + this.food);
    }

    public void sleep(){
        System.out.println(this + " sleep.");
    }

    public String getFood(){
        return this.food;
    }
    public String getLocation(){
        return this.location;
    }
}
