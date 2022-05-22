package ua.ithillel.natochin.four.partthree.animal;

public class Horse extends Animal{
    private String name;
    private String purpose;

    public Horse(String food, String location, String name, String purpose){
        super(food, location);
        this.purpose = purpose;
    }

    @Override
    public void makeNoise(){
        System.out.println("Horse " + this.name + " saying PFFFF");
    }

    @Override
    public void eat() {
        System.out.println("Horse " + this.name + " eating " + this.getFood());
    }

    @Override
    public String toString(){
        return this.purpose + " horse " + this.name;
    }
}
