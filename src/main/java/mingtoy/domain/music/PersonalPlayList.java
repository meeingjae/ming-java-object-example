package mingtoy.domain.music;

public class PersonalPlayList extends PlayList {

    public void remove(Song song) {

        getSongs().remove(song);
        getPersonalList().remove(song.getTitle());
    }
}
