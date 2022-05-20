package ua.ithillel.chernovol.four.ClassesPartThree;

/**
 * @author Chernovol Alexander
 */

//Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета,
// факультет, дата рождения, телефон. Методы takeBook(), returnBook().
//        Перегрузить методы takeBook(), returnBook():
//        takeBook, который будет принимать количество взятых книг.
//        Выводит на консоль сообщение "Петров В. В. взял 3 книги".

//        takeBook, который будет принимать переменное количество названий книг.
//        Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

//        takeBook, который будет принимать переменное количество объектов класса Book
//        (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение
//        "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия". Аналогичным образом перегрузить
//        метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь,
//        Энциклопедия". Или "Петров В. В. вернул 3 книги".

public class Reader {
    String fullName;
    int id;
    String faculty;
    String birthDay;
    String phone;

    public static void main(String[] args) {
        Reader firstReader = new Reader("Иванов Иван",1,"Экономика",
                "Апрель 2002","0969774552");
        Reader secondReader = new Reader("Пупкин Пуп",2,"Лингвистика",
                "Январь 2003", "0501520999");

        Book firtsBook = new Book("Экономика мира", "Главный экономист");
        Book secondBook = new Book("Лучший язык", "Языковед");
        Book thirdBook = new Book("Теория ничего", "Аноним");
        Book fourthBook = new Book("Джава лучшая", "Джавист");


        firstReader.takeBook(firtsBook,secondBook,fourthBook);
        secondReader.takeBook(" \"Дон\" том 1"," \"Дон\" том 2", " \"Дон\" том 3");
        firstReader.takeBook(4);

        secondReader.returnBook(firtsBook,secondBook,fourthBook);
        secondReader.returnBook(2);
        firstReader.returnBook("Муму","Война и мир");

    }
    public Reader(String fullName, int id, String faculty, String birthDay, String phone) {
        this.fullName = fullName;
        this.id = id;
        this.faculty = faculty;
        this.birthDay = birthDay;
        this.phone = phone;
    }

    //Перегруженные методы takeBook
    private void takeBook(int amount){
        System.out.println(fullName + " Взял: " + amount + " книг(и)");
    }
    private void takeBook(String ... names){
        String str = fullName + " Взял книги: ";
        for (String s: names){
            str += s + ", ";
        }
        System.out.println(str);
    }
    private void takeBook(Book ... books){
        String str = fullName + " Взял книги: ";
        for (Book b : books){
            str += b.getName() + ", ";
        }
        System.out.println(str);
    }

    //Перегруженные методы returnBook
    private void returnBook(int amount){
        System.out.println(fullName + "Вернул: " + amount + " книг(и)");
    }
    private void returnBook(String ... names){
        String str = fullName + " Вернул книги: ";
        for (String s: names){
            str += s + ", ";
        }
        System.out.println(str);
    }
    private void returnBook(Book ... books){
        String str = fullName + " Вернул книги: ";
        for (Book b : books){
            str += b.getName() + ", ";
        }
        System.out.println(str);
    }
}

class Book{
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
