//4. Определить класс `Reader`, хранящий такую информацию о пользователе библиотеки: `ФИО`, `номер читательского билета`,
//        `факультет`, `дата рождения`, `телефон`. Методы `takeBook()`, `returnBook()`.
//        - Перегрузить методы `takeBook()`, `returnBook()`:
//        - `takeBook`, который будет принимать количество взятых книг. Выводит на консоль
//        сообщение "Петров В. В. взял 3 книги".
//        - `takeBook`, который будет принимать переменное количество названий книг. Выводит на консоль
//        сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        - `takeBook`, который будет принимать переменное количество объектов класса `Book`
//        (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение
//        "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        Аналогичным образом перегрузить метод `returnBook()`. Выводит на консоль сообщение
//        "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
package ua.ithillel.part3;

public class Reader {
    private String nameFull;
    private int cardNumber;
    private String faculty;
    private String dateBirth;
    private String telephone;

    public Reader(String nameFull, int cardNumber, String faculty, String dateBirth, String telephone) {
        this.nameFull = nameFull;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.telephone = telephone;
    }
    public void takeBook (int takesBooks){
        System.out.println(nameFull + "взял" + takesBooks);
    }
    public void takeBook(String nameBooks){
        System.out.println(nameFull + "взял" + nameBooks);
    }
    public void takeBook(Book book) {
        System.out.println(nameFull +"взял" + book);
    }

    public void returnBook(Book book){
        System.out.println(nameFull + " vernul " + book);
    }
    public void returnBook(int takesBooks){
        System.out.println(nameFull + " vernul " + takesBooks);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "nameFull='" + nameFull + '\'' +
                ", cardNumber=" + cardNumber +
                ", faculty='" + faculty + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
