package ua.ithillel.natochin.four.partthree.veterinarian;

import ua.ithillel.natochin.four.partthree.animal.*;

public class Veterinarian {

    public void treatAnimal(Animal animal){
        System.out.println(animal + " eats " + animal.getFood() + " at " + animal.getLocation());
    }
}
