package ua.ithillel.iovchev.four.partThree.itemSeven;

public class Solution {

    public static void main(String[] args) {
        Vet vet = new Vet();
        Animal[] animals = new Animal[3];
        Animal cat = new Cat("рыба", "Таирово", 1.5);
        Animal dog = new Dog("мясо", "Черемушки", 3.0);
        Animal horse = new Horse("овес", "Центр", 50);

        animals[0] = cat;
        animals[1] = dog;
        animals[2] = horse;

        for (Animal animal : animals){
          vet.treatAnimal(animal);
        }

    }
}
