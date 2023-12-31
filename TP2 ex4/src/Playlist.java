import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    private ArrayList<Song> songs;
    private User user;
    public Playlist(User user){
        songs=new ArrayList<>();
        this.user=user;
    }
    public void add(Song song){
        songs.add(song);
    }
    public void remove(Song song){
        songs.remove(song);
    }
    public void displaySongs(){
        System.out.println("This Playlist contain :");
        for (Song song : songs){
            System.out.println("*"+song.getTitle());
        }
    }
    public void shuffle(){
        Collections.shuffle(songs);
    }
}
