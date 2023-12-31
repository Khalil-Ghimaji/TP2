import java.util.ArrayList;

public class Album {
    private String title;
    private ArrayList<Song> songs;
    public Album(String title){
        this.title = title;
        songs=new ArrayList<>();
    }
    public void add(Song song){
        songs.add(song);
    }
    public void remove(Song song){
        songs.remove(song);
    }
    public void displaySongs(){
        System.out.println("This Album contain :");
        for (Song song : songs){
            System.out.println("*"+song.getTitle());
        }
    }

    public String getTitle() {
        return title;
    }
}
