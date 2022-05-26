package ua.ithillel.Lievientsov.HomeworkFive.PartThree;

//7. Создать класс `Animal` и расширяющие его классы `Dog`, `Cat`, `Horse`. Класс `Animal` содержит переменные `food`,
// `location` и методы `makeNoise`, `eat`, `sleep`. Метод makeNoise, например,
// может выводить на консоль "Такое-то животное спит". `Dog`, `Cat`, `Horse` переопределяют методы `makeNoise`,
// `eat`. Добавьте переменные в классы `Dog`, `Cat`, `Horse`, характеризующие только этих животных.
// Создайте класс Ветеринар, в котором определите метод `void treatAnimal(Animal animal)`.
// Пусть этот метод распечатывает `food` и `location` пришедшего на прием животного.
// В методе main создайте массив типа `Animal`, в который запишите животных всех имеющихся у вас типов.
// В цикле отправляйте их на прием к ветеринару.


public class Animal {
    private String food;
    private String location;

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Fish", "In the house", "Moore");
        animals[1] = new Dog("Feed", "In the yard", "Woof");
        animals[2] = new Horse("Hay ", "In the meadow", "Neighs");
        for (Animal value : animals) {
            Veterinary.treatAnimal(value);
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

    public void makeNoise() {
        System.out.println("The animal speaks!");
    }

    public void eat() {
        System.out.println("The animal eats!");
    }

    public void sleep() {
        System.out.println("The animal sleeps!");
    }
}

class Veterinary {
    public static void treatAnimal(Animal animal) {
        System.out.println("Eats: " + animal.getFood() + "\n" +
                "Lives: " + animal.getLocation() + "\n");
    }
}

class Dog extends Animal {
    private String barking;

    public Dog(String food, String location, String barking) {
        super(food, location);
        this.barking = barking;
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog says:" + barking);
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
}

class Cat extends Animal {
    private String meow;

    public Cat(String food, String location, String meow) {
        super(food, location);
        this.meow = meow;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat says: " + meow);
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

}

class Horse extends Animal {
    private String roars;

    public Horse(String food, String location, String neigh) {
        super(food, location);
        this.roars = neigh;
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse says: " + roars);
    }

    @Override
    public void eat() {
        System.out.println("Horse eats");
    }
}
