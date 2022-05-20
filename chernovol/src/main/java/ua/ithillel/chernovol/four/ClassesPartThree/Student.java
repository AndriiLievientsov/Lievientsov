package ua.ithillel.chernovol.four.ClassesPartThree;

/**
 * @author Chernovol Alexander
 */

//        Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента
//        наличием некой научной работы.
//        Класс Student содержит переменные: String firstName, lastName, group. А также double averageMark,
//        содержащую среднюю оценку.
//        Создать переменную типа Student, которая ссылается на объект типа Aspirant`.
//        Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
//        Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе Aspirant.
//        Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
//        Создать массив типа Student, содержащий объекты класса Student и Aspirant.
//        Вызвать метод getScholarship() для каждого элемента массива.
public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public static void main(String[] args) {
        Student[] students = new Student[2];

        students[0] = new Aspirant("Ксения", "Богучарова", "Дизайнеры", 5.0,
                "Разбор английского");
        students[1] = new Student("Александр", "Черновол", "Программисты", 4.5);

        students[0].getScholarship();
        students[1].getScholarship();
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void getScholarship() {
        if (averageMark == 5)
            System.out.println("Сумма степендии: 100");
        else
            System.out.println("Сумма степендии: 80");
    }

    public double getAverageMark() {
        return averageMark;
    }
}

class Aspirant extends Student {
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public void getScholarship() {
        if (super.getAverageMark() == 5)
            System.out.println("Сумма степендии: 200");
        else
            System.out.println("Сумма степендии: 180");
    }
}
