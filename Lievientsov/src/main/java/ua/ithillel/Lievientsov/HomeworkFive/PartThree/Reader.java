package ua.ithillel.Lievientsov.HomeworkFive.PartThree;

//4. Определить класс `Reader`, хранящий такую информацию о пользователе библиотеки: `ФИО`,
// `номер читательского билета`, `факультет`, `дата рождения`, `телефон`. Методы `takeBook()`, `returnBook()`.
//        - Перегрузить методы `takeBook()`, `returnBook()`:
//        - `takeBook`, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В.
//        взял 3 книги".
//        - `takeBook`, который будет принимать переменное количество названий книг.
//        Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        - `takeBook`, который будет принимать переменное количество объектов класса `Book`
//        (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги:
//        Приключения, Словарь, Энциклопедия".
// Аналогичным образом перегрузить метод `returnBook()`.
// Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
// Или  "Петров В. В. вернул 3 книги".
public class Reader {
    private String FullName;
    private int LibraryCardNumber;
    private String Faculty;
    private String DateOfBirth;
    private String Phone;

    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.takeBook(9);
        reader.takeBook("One", "Two");
        Book book = new Book("Stephen King", "The Shining");
        reader.takeBook(book);
        System.out.println();
        reader.returnBook(5);
        reader.returnBook("Two", "One");
        reader.returnBook(book);
    }

    public void takeBook() {
    }

    public void returnBook() {
    }

    public void takeBook(int NumberOfBooksTaken) {
        System.out.println("Петров В. В. взял 3 книги");
    }

    public void takeBook(String... ListTakenBooks) {
        System.out.println("Петров В. В. взял книги: Приключения, Словарь, Энциклопедия");
    }

    public void takeBook(Book book) {
        System.out.println("Петров В. В. взял книги: Приключения, Словарь, Энциклопедия");
    }

    public void returnBook(String... ListTakenBooks) {
        System.out.println("Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия");
    }

    public void returnBook(int NumberOfBooksTaken) {
        System.out.println("Петров В. В. вернул 3 книги");
    }

    public void returnBook(Book book) {
        System.out.println("Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия");
    }

    static class Book {
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
}
