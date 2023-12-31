public class Song {
    private String title;
    private String lyrics;
    private int songLength;
    private String access;
    public Song(String title, String lyrics, int songLength, String access){
        this.title=title;
        this.lyrics=lyrics;
        this.songLength=songLength;
        this.access = access;
    }
    public void playSong(){
        System.out.println("Read this with melody`\n"+lyrics);
    }

    public int getSongLength() {
        return songLength;
    }

    public String getTitle() {
        return title;
    }

    public String getAccess() {
        return access;
    }
}
