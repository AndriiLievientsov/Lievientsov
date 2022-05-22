package ua.ithillel.natochin.four.partthree.reader;

public class Book {
    private String bookName;
    private String bookAuthor;

    public Book (String bookName, String bookAuthor){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString(){
        return this.bookName + " (" + this.bookAuthor + ")";
    }
}
