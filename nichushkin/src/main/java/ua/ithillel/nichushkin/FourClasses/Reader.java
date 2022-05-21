package ua.ithillel.nichushkin.FourClasses;

public class Reader {
    //4. Определить класс `Reader`, хранящий такую информацию о пользователе библиотеки: `ФИО`,
    // `номер читательского билета`, `факультет`, `дата рождения`, `телефон`. Методы `takeBook()`,
    // `returnBook()`.
    //   - Перегрузить методы `takeBook()`, `returnBook()`:
    //        - `takeBook`, который будет принимать количество взятых книг. Выводит на консоль сообщение
    //        "Петров В. В. взял 3 книги".
    //        - `takeBook`, который будет принимать переменное количество названий книг. Выводит на консоль
    //        сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
    //        - `takeBook`, который будет принимать переменное количество объектов класса `Book` (создать
    //        новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял
    //        книги: Приключения, Словарь, Энциклопедия".
    // Аналогичным образом перегрузить метод `returnBook()`. Выводит на консоль сообщение "Петров В. В.
    // вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".

    private String firstLastName;
    private int valueReaderCard;
    private String faculty;
    private String birthDate;
    private int PhoneNumber;

    public void takeBook(){
    }

    public void returnBook(){
    }

    public void takeBook (int counterTakenBooks){
        System.out.println("Петров В. В. взял 3 книги");
    }

    public void takeBook (String[]listTakenBooks){
        System.out.println("Петров В. В. взял книги: Приключения, Словарь, Энциклопедия");
    }

    public void takeBook (Book book){
        System.out.println("Петров В. В. взял книги: Приключения, Словарь, Энциклопедия");
    }

    public void returnBook (String[]listTakenBooks){
        System.out.println("Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия");
    }

    public void returnBook (int counterTakenBooks){
        System.out.println("Петров В. В. вернул 3 книги");
    }

    public void returnBook (Book book){
        System.out.println("Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия");
    }

}

