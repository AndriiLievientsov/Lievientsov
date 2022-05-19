package ua.ithillel.nichushkin.FourClasses;

import java.util.Arrays;

// Создайте класс Ветеринар, в котором определите метод `void treatAnimal(Animal animal)`. Пусть этот метод
// распечатывает `food` и `location` пришедшего на прием животного. В методе main создайте массив типа `Animal`,
// в который запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.
public class Veterinary {

    private Animal[] animal;

    public Veterinary(Animal[] animal) {
        this.animal = animal;
    }

    public void treatAnimal(Animal[] animal) {
        for (int i = 0; i < animal.length; i++) {
            System.out.printf("Животное %d ест %s и обитает в %s %n", i + 1, animal[i].getFood(),
                    animal[i].getLocation());
        }
    }
}
