package ua.ithillel.iovchev.four.partThree.itemFive;

    /*5. Создайте пример наследования, реализуйте класс `Student` и класс `Aspirant`,
            аспирант отличается от студента наличием некой научной работы.
        - Класс Student содержит переменные: `String firstName`, `lastName`, `group`.
            А также `double averageMark`, содержащую среднюю оценку.
        - Создать переменную типа `Student`, которая ссылается на объект типа Aspirant`.
        - Создать метод `getScholarship()` для класса `Student`, который возвращает сумму стипендии.
            Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе `Aspirant`.
            Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
        - Создать массив типа `Student`, содержащий объекты класса `Student` и `Aspirant`.
            Вызвать метод `getScholarship()` для каждого элемента массива.*/

public class Solution {
    public static void main(String[] args) {
        Student[] arrayStudent = new Student[2];
        Student aspirant = new Aspirant("Alex", "Jonson", "Lawyer4", 5, "Criminal law");
        arrayStudent[0] = aspirant;
        Student student = new Student("Pavel", "Sidorov", "Lawyer4", 4.2);
        arrayStudent[1] = student;

        for (Student st : arrayStudent) {
            System.out.println(st.getFirstName() + " " + st.getLastName() + " "
                    + "средняя оценка " + st.getAverageMark() + ", стипендия " + st.getScholarship());
        }
    }
}
