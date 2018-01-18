package kaola.com.study.course02.after;

/**
 * @Author:zouw
 * @Description:
 * @Date:Created in 15:30 2018/1/18
 * @Modified By:
 */
public class CD extends Item{
    private String artist;

    public CD(String title, int numofTracks, int playingTime, String comment, String artist) {
        super(title, numofTracks, playingTime, comment);
        this.artist = artist;
    }

    public CD() {
        super();
    }

    @Override
    public void print() {
        System.out.println("CD");
    }
}
