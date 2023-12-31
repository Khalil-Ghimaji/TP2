import java.util.ArrayList;

public class Artist {
    private ArrayList<Album> albums;
    public Artist(){
        albums=new ArrayList<>();
    }
    public void add(Album album){
        albums.add(album);
    }
    public void remove(Album album){
        albums.remove(album);
    }
    public void displayalbums(){
        System.out.println("This artist have these albums :");
        for (Album album : albums){
            System.out.println("*"+album.getTitle());
        }
    }
}
