package ua.ithillel.nichushkin.FourClasses;



import ua.ithillel.nichushkin.FourClasses.Details.Engine;
import ua.ithillel.nichushkin.FourClasses.Professions.Driver;
import ua.ithillel.nichushkin.FourClasses.Vehicles.Car;
import ua.ithillel.nichushkin.FourClasses.Vehicles.Lorry;
import ua.ithillel.nichushkin.FourClasses.Vehicles.SportCar;

import java.util.Arrays;
import java.util.Random;

public class Main3 {

    public static void main(String[] args) {
        // ### Часть 3:
        //   - Вызвать из конструктора с двумя параметрами конструктор с тремя параметрами.

        Phone phone1 = new Phone(123456, "Sony", 8.5);
        Phone phone2 = new Phone(456789, "Redmi", 12.2);
        Phone phone3 = new Phone(987321, "Apple", 3.8);
        Phone phone4 = new Phone(78945, 1.1);
        System.out.println(phone1.toString());
        System.out.println((phone2.toString()));
        System.out.println(phone3.toString());
        System.out.println(phone4.toString());
        phone1.receiveCall("Vasya");
        phone1.getNumber();
        phone2.receiveCall("Petya");
        phone2.getNumber();
        phone3.receiveCall("Anna");
        phone3.getNumber();
        phone1.receiveCall("Jhonny", 147258);
        phone2.receiveCall("Hercules", 369258);
        phone3.receiveCall("Aragorn", 789456);
        phone1.sendMessage(new int[]{444, 5555, 4555, 5555});
        Person person1 = new Person();
        Person person2 = new Person("Igor", 11);
        person1.talk();
        person1.move();
        person2.talk();
        person2.move();
        Reader reader1 = new Reader();
        reader1.takeBook(4);
        reader1.takeBook(new String[]{"First", "Second"});
        Book book = new Book();
        reader1.takeBook(book);
        reader1.returnBook(5);
        reader1.returnBook(new String[]{"Second", "First"});
        reader1.returnBook(book);

        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(3, 3);
        Matrix matrixSum = new Matrix(3, 3);
        System.out.println("1-я матрица");
        matrix1.creatValuesMatrix();
        matrix1.printMatrix();
        System.out.println("2-я матрица");
        matrix2.creatValuesMatrix();
        matrix2.printMatrix();
        System.out.println("Cложение матриц");
        try {
            matrixSum.matrixSum(matrix1, matrix2);
            matrixSum.printMatrix();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Умножение матриц");
        Matrix matrixMultiplyMatrix = new Matrix(3, 3);
        try {
            matrixMultiplyMatrix.multiplyMatrix(matrix1, matrix2);
            matrixMultiplyMatrix.printMatrix();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        Random random = new Random();
        int value = random.nextInt(1, 10);
        System.out.printf("Умножение матрицы на число %d %n", value);
        Matrix matrixMultiplyValue = new Matrix(3, 3);
        try {
            matrixMultiplyValue.matrixMultiplyValue(matrix1, value);
            matrixMultiplyValue.printMatrix();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


        Student[] student1 = new Student[4];
        Student[] student2 = new Aspirant[2];
//        Random random = new Random();

        student1[0] = new Student("Vasya", "Ivanov", "tr", 5);
        student1[1] = new Student("Anna", "Shag", "trw", 3);
        student1[2] = new Student("Ganna", "Tag", "pp", 5);
        student1[3] = new Student("Ivan", "Smirnov", "RR", 3);
        System.out.println(Arrays.toString(student1));
        System.out.println();
        student2[0] = new Aspirant("Petr", "Usach", "um1", 5, true);
        student2[1] = new Aspirant("Eva", "Roza", "um2", 3, true);
        System.out.println(Arrays.toString(student2));

        Driver driver1 = new Driver("Ivanov", 10);
        Engine engine1 = new Engine(80, 50);
        Car car1 = new Car("WV", "A", 1500, driver1, engine1);
        car1.printInfo();
        System.out.println();

        Driver driver2 = new Driver("Smirnof", 15);
        Engine engine2 = new Engine(180, 250);
        Lorry lorry1 = new Lorry("Ford", "B", 3500, driver2, engine2, 5500);
        lorry1.printInfo();
        System.out.println();

        Driver driver3 = new Driver("Garry", 3);
        Engine engine3 = new Engine(750, 450);
        SportCar sportCar1 = new SportCar("KIA", "D", 1200, driver3,
                engine3, 250);
        sportCar1.printInfo();
        System.out.println();

        Animal[] animalWendsday = new Animal[6];
        animalWendsday[0] = new Cat("meat", "Dnipro", "Meom");
        animalWendsday[1] = new Cat("vegetables", "Kiyv", "Meonme");
        animalWendsday[2] = new Dog("meat", "Dnipro", "Bark");
        animalWendsday[3] = new Dog("bone", "Kiyv", "Bark");
        animalWendsday[4] = new Horse("vegetables", "Kiyv", "Igogo");
        animalWendsday[5] = new Horse("Grass", "Dnipro", "BrBr");

        Veterinary veterinary = new Veterinary(animalWendsday);
        veterinary.treatAnimal(animalWendsday);
    }
}
