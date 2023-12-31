public class PremiumUser implements User{
    private String name;
    private Playlist myPlaylist;

    public PremiumUser(String name) {
        this.name = name;
        this.myPlaylist = new Playlist(this);
    }

    @Override
    public void listen(Song song) {
        song.playSong();
    }

    public void addToPlaylist(Song song) {
        myPlaylist.add(song);
    }
    public void removeFromPlaylist(Song song){
        myPlaylist.remove(song);
    }
    public void shuffle(){
        myPlaylist.shuffle();
    }
}
