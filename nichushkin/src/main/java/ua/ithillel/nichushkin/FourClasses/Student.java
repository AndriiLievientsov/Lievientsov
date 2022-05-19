package ua.ithillel.nichushkin.FourClasses;

//5. Создайте пример наследования, реализуйте класс `Student` и класс `Aspirant`,
// аспирант отличается от студента наличием некой научной работы.
//   - Класс Student содержит переменные: `String firstName`, `lastName`, `group`.
//   А также `double averageMark`, содержащую среднюю оценку.
//   - Создать переменную типа `Student`, которая ссылается на объект типа Aspirant`.
//   - Создать метод `getScholarship()` для класса `Student`, который возвращает сумму стипендии.
//   Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе
//   `Aspirant`.  Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
//   - Создать массив типа `Student`, содержащий объекты класса `Student` и `Aspirant`. Вызвать
//   метод `getScholarship()` для каждого элемента массива.
//---
public class Student {
    //    private boolean scientificPaper = false;
    private String firstName;
    private String lastName;
    private String group;
    private int averageMark;

    public Student(){
    }
    public Student(String firstName, String lastName, String group,
                   int averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship(int averageMark){
        double resault = 0;
        if (averageMark == 5){
            resault = 100;
        } else {
            resault = 80;
        }
        return resault;
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

    public int getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return "Студент: " + "Имя:" + getFirstName() +
                ", Фамилия: " + getLastName() +
                ", группа = " + getGroup() +
                ", средний бал = " + getAverageMark() +
                ", cтепендия составляет: " + getScholarship(getAverageMark()) + " грн" + "\n";
    }
}
