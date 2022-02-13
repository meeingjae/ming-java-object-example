package mingtoy.domain.music;

import lombok.Getter;

import java.util.HashMap;
import java.util.List;

@Getter
public class PlayList {

    private List<Song>              songs;
    private HashMap<String, String> personalList;

    public void add(Song song) {

        songs.add(song);
        personalList.put(song.getTitle(), song.getSinger());
    }

}
