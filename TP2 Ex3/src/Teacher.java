public class Teacher implements LibraryUser{
    private String name;
    private int id;
    private LibraryCard myCard;

    public Teacher(int id,String name){
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
        System.out.print("The "+ this.getClass().getName().toLowerCase()+" "+ this.name+ " borrowed :");
        myCard.display();
    }
}
