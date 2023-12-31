import java.util.ArrayList;

public class Student implements LibraryUser{
    private LibraryCard myCard;
    private String name;
    private int id;

    public Student(int id,String name){
        this.id=id;
        this.name=name;
        this.myCard= new LibraryCard();

    }
    public void borrowBook(Book book) {
        myCard.add(book);
    }

    public void returnBook(Book book) {
        myCard.remove(book);
    }

    public void displayLibraryCard() {
        System.out.print("The "+this.getClass().getName().toLowerCase()+" "+ this.name+ " borrowed :");
        myCard.display();
    }
}
