package mingtoy.domain.music;

public class PersonalPlayList {

    private PlayList playList = new PlayList();

    public void append(Song song) {
        playList.add(song);
    }

    public void remove(Song song) {

        playList.getSongs().remove(song);
        playList.getPersonalList().remove(song.getTitle());
    }
}
