package ua.ithillel.natochin.four.partthree.reader;

public class Reader {
    private String fullName;
    private String readerID;
    private String faculty;
    private String bithday;
    private String telNumber;

    public Reader(String fullName, String readerID, String faculty, String birthday, String telNumber){
        this.fullName = fullName;
        this.readerID = readerID;
        this.faculty = faculty;
        this.bithday = birthday;
        this.telNumber = telNumber;
    }

    public void takeBook(int quantity){
        System.out.print (this.fullName + " took " + quantity + " books");
    }

    // below method to be used and restricted for Book and String all types of Object
    public void takeBook(String ... books){
        this.takeBook(books.length);
        System.out.print(": ");
        System.out.print(books[0]);
        for (int i = 1; i<books.length; i++){
            System.out.print(", " + books[i]);
        }
    }

    public void takeBook(Book ... books){
        this.takeBook(books.length);
        System.out.print(": ");
        System.out.print(books[0]);
        for (int i = 1; i<books.length; i++){
            System.out.print(", " + books[i]);
        }
    }

    public void returnBook(int quantity){
        System.out.print (this.fullName + " returned " + quantity + " books");
    }

    public void returnBook(String ... books){
        this.returnBook(books.length);
        System.out.print(": ");
        System.out.print(books[0]);
        for (int i = 1; i<books.length; i++){
            System.out.print(", " + books[i]);
        }
    }

    public void returnBook(Book ... books){
        this.returnBook(books.length);
        System.out.print(": ");
        System.out.print(books[0]);
        for (int i = 1; i<books.length; i++){
            System.out.print(", " + books[i]);
        }
    }

    @Override
    public String toString(){
        return "Reader " + this.fullName + ", " + " d.o.b. " + this.bithday;
    }

}
