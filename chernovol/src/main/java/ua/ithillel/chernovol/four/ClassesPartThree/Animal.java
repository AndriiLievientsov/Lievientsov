package ua.ithillel.chernovol.four.ClassesPartThree;

// Создать класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal содержит переменные food, location и
// методы makeNoise, eat, sleep. Метод makeNoise, например, может выводить на консоль "Такое-то животное спит". Dog,
// Cat, Horse переопределяют методы makeNoise, eat. Добавьте переменные в классы Dog, Cat, Horse, характеризующие
// только этих животных. Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
// Пусть этот метод распечатывает food и location пришедшего на прием животного. В методе main создайте массив
// типа Animal, в который запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.

/**
 * @author Chernovol Alexander
 */
public class Animal {
    private String food;
    private String location;

    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Cat("Мясо","Лес","Мяу");
        animal[1] = new Dog("Мясо","Степь","Гав");
        animal[2] = new Horse("Трава","Степь","Иго-го");
        for (Animal a: animal) {
            Veterinary.treatAnimal(a);
        }

    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise(){
        System.out.println("Животное говорит!");
    }

    public void eat(){
        System.out.println("Животное ест!");
    }

    public void sleep(){
        System.out.println("Животное спит!");
    }
}
class Veterinary{

    public static void treatAnimal(Animal animal){
        System.out.println("Ест :" + animal.getFood() + " Обитает: " + animal.getLocation());
    }
}

class Cat extends Animal{

    String meow;

    public Cat(String food, String location, String meow) {
        super(food, location);
        this.meow = meow;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот говорит "+ meow + "!");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест!");
    }
}

class Dog extends Animal{

    String barking;

    public Dog(String food, String location, String barking) {
        super(food, location);
        this.barking = barking;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака говорит " + barking +"!");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест!");
    }
}

class Horse extends Animal{

    String neigh;

    public Horse(String food, String location, String neigh) {
        super(food, location);
        this.neigh = neigh;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошать говорит " + neigh +"!");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь есть");
    }
}

