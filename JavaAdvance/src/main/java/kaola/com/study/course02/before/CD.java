package kaola.com.study.course02.before;

/**
 * @Author:zouw
 * @Description: 创建一个CD媒体类型
 * @Date:Created in 14:44 2018/1/18
 * @Modified By:
 */
public class CD {
    private String title;
    private String artist;
    private int numofTracks;
    private int playingTime;
    private boolean gotIt=false;
    private String comment;

    public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
        this.title = title;
        this.artist = artist;
        this.numofTracks = numofTracks;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public CD() {
    }

    public void print() {
        print(title+":"+artist);
    }
    public static <T> void print(T s)
    {
        System.out.println(s);
    }
}
