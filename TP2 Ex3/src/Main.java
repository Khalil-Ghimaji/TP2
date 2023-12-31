// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Library myLibrary=new Library();
        Book B1 = new Book("Book 1", "Author 1", 2023);
        Novel B2 = new Novel("Novel 1", "Author 1", 2022);
        myLibrary.add(B1);
        myLibrary.add(B2);
        myLibrary.display();
        myLibrary.remove(B1);
        myLibrary.display();
        Student student=new Student(1,"khalil");
        Teacher teacher=new Teacher(1,"Ghimaji");
        student.borrowBook(B1);
        teacher.borrowBook(B2);
        student.displayLibraryCard();
        teacher.returnBook(B2);
        teacher.displayLibraryCard();
    }
}