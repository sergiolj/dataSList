package list1.tadExerc.models;

import java.time.Duration;

public class Music {
    private String title;
    private String artist;
    private Duration duration;

    public Music(String title, String artist, Duration duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "{ Title: "+title+", Artist: "+artist+", Duration: "+duration+"}";
    }
}
