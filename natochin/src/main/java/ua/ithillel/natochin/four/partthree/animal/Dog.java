package ua.ithillel.natochin.four.partthree.animal;

public class Dog extends Animal{
    private String name;
    private Boolean withPatterns;

    public Dog(String food, String location, String name, Boolean isWithPattern){
        super(food,location);
        this.name = name;
        this.withPatterns = isWithPattern;
    }

    @Override
    public void makeNoise(){
        System.out.println("Dog " + this.name + " saying woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog " + this.name + " eating " + this.getFood());
    }

    @Override
    public String toString(){
        if(withPatterns){
            return "Patterned dog " + this.name;
        }
        return "Dog " + this.name;
    }

}
