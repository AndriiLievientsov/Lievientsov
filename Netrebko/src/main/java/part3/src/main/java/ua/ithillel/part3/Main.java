package ua.ithillel.part3;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone(1111111, "alkatel", 150);
        Phone p2 = new Phone(2222222, "nokia" ,140);
        Phone p3 = new Phone(3333333 , "sony" , 110);

        p1.receiveCall();
        p2.receiveCall();
        p3.receiveCall();
        p1.getNumber(1111111);
        p2.getNumber(2222222);
        p3.getNumber(3333333);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p1.receiveCall(585858, "Anton");

        Person person = new Person();
        Person person1 = new Person("Nikita" , 25);
        System.out.println(person1);

        Reader read = new Reader("Petrov V.V", 333, "ibm", "02/02/1999", "098887877");
        read.returnBook(new Book("Slovo" ,"Slov"));



        Student s = new Student("Petrov", "Petro", "work01", 5.0);
        Aspirant a = new Aspirant("Ivanov", "Ivan", "group02", 4.5, "BestWork");
        Student[] students = {s, a} ;
        s.getScholarship();
        a.getScholarship();


        Horse h = new Horse("Seno", "Zagon", "Koputa");
        Cat c = new Cat("Milk", "Divan", "Water");
        Dog d = new Dog("Kosti", "Budka", "Oxrana");
        Animal[] animal = {h, c, d};
        for(Animal j : animal){
            Veterenar.treatAnimal(j);
        }


        Matrix m = new Matrix(3,3);
        Matrix m1 = new Matrix(3,3);
        System.out.println("first matrix");
        m.matrixRandom();
        m.matrixPrint();
        System.out.println("second matrix");
        m1.matrixRandom();
        m1.matrixPrint();
        System.out.println("+ matrix");
        m.matrixSum(m,m1);
        m.matrixPrint();
        System.out.println("matrix * value");
        m.matrixValue(m1, 2);
        m.matrixPrint();
        System.out.println("matrix * matrix1");
        m.matrixMultiplication(m,m1);
        m.matrixPrint();




    }
}
