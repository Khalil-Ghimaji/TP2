public class Textbook extends Book {
    public Textbook(String title, String author, int yearOfPublication) {
        super(title, author, yearOfPublication);
    }
    public void displayInformation() {
        System.out.println("The textbook "+" \""+ title + "\" written by " + author + " and published in " + yearOfPublication);
    }
}
