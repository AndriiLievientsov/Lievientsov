package ua.ithillel.natochin.four.partthree.animal;

public class Cat extends Animal{
    private String name;
    private int claws;

    public Cat(String food, String location, String name, int claws){
        super(food,location);
        this.name = name;
        this.claws = claws;
    }
    @Override
    public void makeNoise(){
        System.out.println("Cat " + this.name + " saying meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat " + this.name + " eating " + this.getFood());
    }

    @Override
    public String toString(){
        return "Cat " + this.name;
    }
}
