package iteratorDesign;

public class MediaPlayer {
    public static void main(String[] args) {
        SongsCollection songs = new SongsCollection();
        Iterator songIterator = songs.getIterator();
        while(songIterator.hasNext()) {
            System.out.println(songIterator.next().toString());
        }
    }
}
