import java.util.ArrayList;

public class LibraryCard {
    private ArrayList<Book> myBooks;

    public LibraryCard() {
        myBooks = new ArrayList<>();
    }

    public void add(Book book) {
        myBooks.add(book);
    }

    public void remove(Book book) {
        myBooks.remove(book);
    }

    public void display() {
        System.out.println("{");
        for (Book book : myBooks) {
            book.displayInformation();
        }
        System.out.println("}");
    }
}
