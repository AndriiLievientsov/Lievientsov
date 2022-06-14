package ua.ithillel.iovchev.four.partThree.itemFour;

public class Reader {
    private String fullName;
    private String libraryCardNumber;
    private String faculty;
    private String dateBirth;
    private String phoneNumber;

    public void takeBook() {

    }

    public void returnBook() {

    }

    public void takeBook(int numberBooks) {
        System.out.println(String.format("Петров В. В. взял %d книги.", numberBooks));
        System.out.println("-------------------------------------");
    }

    public void takeBook(String... bookTitles) {
        String allBookTitles = "";
        for (String bookTitle : bookTitles) {
            allBookTitles = allBookTitles + bookTitle + ", ";
        }
        allBookTitles = allBookTitles.substring(0, allBookTitles.length() - 2);
        System.out.println(String.format("Петров В. В. взял книги: %s.", allBookTitles));
        System.out.println("-------------------------------------");
    }

    public void takeBook(Book... books) {
        System.out.println(String.format("Петров В. В. взял книги:"));
        for (Book book : books) {
            System.out.println("\t" + book.getBookTitle() + ", автор " + book.getBookAuthor());
        }
        System.out.println("-------------------------------------");
    }

    public void returnBook(int numberBooks) {
        System.out.println(String.format("Петров В. В. вернул %d книги.", numberBooks));
        System.out.println("-------------------------------------");
    }

    public void returnBook(String... bookTitles) {
        String allBookTitles = "";
        for (String book : bookTitles) {
            allBookTitles = allBookTitles + book + ", ";
        }
        allBookTitles = allBookTitles.substring(0, allBookTitles.length() - 2);
        System.out.println(String.format("Петров В. В. вернул книги: %s.", allBookTitles));
        System.out.println("-------------------------------------");
    }

    public void returnBook(Book... books) {
        System.out.println(String.format("Петров В. В. вернул книги:"));
        for (Book book : books) {
            System.out.println("\t" +book.getBookTitle() + ", автор " + book.getBookAuthor());
        }
        System.out.println("-------------------------------------");
    }
}
