public class FreeUser implements User{
    private String name;
    private Playlist myPlaylist;

    public FreeUser(String name) {
        this.name = name;
        this.myPlaylist = new Playlist(this);
    }

    public void listen(Song song) {
        if (song.getAccess() == "Free") {
            song.playSong();
        } else {
            System.out.println("You have to be a premium user to listen this song");
        }
    }

    public void addToPlaylist(Song song) {
        if (song.getAccess() == "Free") {
            myPlaylist.add(song);
        } else {
            System.out.println("You have to be a premium user to add this song to your playlist");
        }
    }
    public void removeFromPlaylist(Song song){
        myPlaylist.remove(song);
    }
    public void shuffle(){
        myPlaylist.shuffle();
    }
}
