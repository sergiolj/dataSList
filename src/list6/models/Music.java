package list6.models;

public class Music {
    private String title;
    private String artist;
    private String album;
    private int track;
    private int duration;

    public Music(String title, String artist, String album, int track, int duration) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.track = track;
        this.duration = duration;
    }
    public Music(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
