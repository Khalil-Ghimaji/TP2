import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    public Library(){
        books=new ArrayList<>();
    }
    public void add(Book book){
        books.add(book);
    }
    public void remove(Book book){
        books.remove(book);
    }
    public void display(){
        System.out.println("This library contain :{");
        for (Book book : books){
            book.displayInformation();
        }
        System.out.println("}");
    }
}
