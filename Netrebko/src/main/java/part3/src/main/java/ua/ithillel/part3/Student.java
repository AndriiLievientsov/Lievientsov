//5. Создайте пример наследования, реализуйте класс `Student` и класс `Aspirant`, аспирант отличается от студента
//        наличием некой научной работы.
//        - Класс Student содержит переменные: `String firstName`, `lastName`, `group`. А также `double averageMark`,
//        содержащую среднюю оценку.
//        - Создать переменную типа `Student`, которая ссылается на объект типа Aspirant`.
//        - Создать метод `getScholarship()` для класса `Student`, который возвращает сумму стипендии.
//        Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в
//        классе `Aspirant`.  Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
//        - Создать массив типа `Student`, содержащий объекты класса `Student` и `Aspirant`.
//        Вызвать метод `getScholarship()` для каждого элемента массива.
//        ---
package ua.ithillel.part3;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    protected double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public  void getScholarship(){
        if(averageMark == 5.0){
            System.out.println("Suma 100grn.");
        }else{
            System.out.println("Suma 80grn.");
        }
    }
}
