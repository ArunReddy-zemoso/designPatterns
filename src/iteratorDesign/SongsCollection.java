package iteratorDesign;

import java.util.ArrayList;

public class SongsCollection {
    public ArrayList<Song> songs = new ArrayList<>();

    public SongsCollection() {
        songs.add(new Song("River","Charlie Puth"));
        songs.add(new Song("Sorry","Justin Bieber"));
        songs.add(new Song("Love Me Like You Do","Elli Goulding"));
        songs.add(new Song("Closer","The Chainsmokers"));
        songs.add(new Song("Wolves","Selena Gomez"));
        songs.add(new Song("Faded","Alan Walker"));
    }

    public Iterator getIterator() {
        return new SongsIterator();
    }

    public class SongsIterator implements Iterator{
        int index=0;

        @Override
        public boolean hasNext() {
            return index < songs.size()?true:false;
        }

        @Override
        public Object next() {
            return this.hasNext()?songs.get(index++):null;
        }
    }

}
