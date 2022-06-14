package ua.ithillel.iovchev.four.partThree.itemSeven;

public class Vet {

    void treatAnimal(Animal animal){
        System.out.println("Ест " + animal.getFood() + ". Родом из " + animal.getLocation() + ".");
    }
}
