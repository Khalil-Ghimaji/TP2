public class Book {
    protected String title;
    protected String author;
    protected int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void displayInformation() {
        System.out.println("The book "+" \""+ title + "\" written by " + author + " and published in " + yearOfPublication);
    }
}
