package ua.ithillel.Lievientsov.HomeworkFive.PartThree;

import java.util.Arrays;

//5. Создайте пример наследования, реализуйте класс `Student` и класс `Aspirant`,
// аспирант отличается от студента наличием некой научной работы.
//   - Класс Student содержит переменные: `String firstName`, `lastName`, `group`.
//   А также `double averageMark`, содержащую среднюю оценку.
//   - Создать переменную типа `Student`, которая ссылается на объект типа Aspirant`.
//   - Создать метод `getScholarship()` для класса `Student`,
//   который возвращает сумму стипендии. Если средняя оценка студента равна 5,
//   то сумма 100 грн, иначе 80. Переопределить этот метод в классе `Aspirant`.
//   Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
//   - Создать массив типа `Student`, содержащий объекты класса `Student` и `Aspirant`.
//   Вызвать метод `getScholarship()` для каждого элемента массива.

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("Max", "Nomad", "Engineering", 3.0);
        students[1] = new Aspirant("Kelly", "Fay", "Chemist", 5.0,
                "Antibiotics");
        System.out.println(Arrays.toString(new Student[]{students[0]}));
        students[0].getScholarship();
        System.out.println();
        System.out.println(Arrays.toString(new Student[]{students[1]}));
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return getFirstName() + " "
                + getLastName() + ", "
                + getGroup() + ", "
                + getAverageMark();
    }

    public static class Aspirant extends Student {
        private String scientificWork;

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
}
