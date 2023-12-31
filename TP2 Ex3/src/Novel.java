public class Novel extends Book{
    public Novel(String title, String author, int yearOfPublication) {
        super(title, author, yearOfPublication);
    }
    public void displayInformation() {
        System.out.println("The novel "+" \""+ title + "\" written by " + author + " and published in " + yearOfPublication);
    }
}
