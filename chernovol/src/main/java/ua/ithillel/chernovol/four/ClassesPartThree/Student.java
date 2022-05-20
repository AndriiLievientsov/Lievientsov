package ua.ithillel.chernovol.four.ClassesPartThree;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public static void main(String[] args) {
        Student [] students = new Student[2];

        students[0] = new Aspirant("Ксения", "Богучарова", "Дизайнеры",5.0);
        students[1] = new Student("Александр", "Черновол", "Программисты",4.5);

        students[0].getScholarship();
        students[1].getScholarship();
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void getScholarship(){
        if(averageMark == 5)
            System.out.println("Сумма степендии: 100");
        else
            System.out.println("Сумма степендии: 80");
    }
}

class Aspirant extends Student{

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public void getScholarship(){
        if(averageMark == 5)
            System.out.println("Сумма степендии: 200");
        else
            System.out.println("Сумма степендии: 180");
    }
}
