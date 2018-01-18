package kaola.com.study.course02.before;

/**
 * @Author:zouw
 * @Description:创建一种DVD媒体项
 * @Date:Created in 14:59 2018/1/18
 * @Modified By:
 */
public class DVD {
    private String title;
    private String director;
    private int numofTracks;
    private int playingTime;
    private boolean gotIt=false;
    private String comment;

    public DVD(String title, String director, int numofTracks, int playingTime, String comment) {
        this.title = title;
        this.director = director;
        this.numofTracks = numofTracks;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public DVD() {
    }

    public void print() {
        print(title+":"+director);
    }
    public static <T> void print(T s)
    {
        System.out.println(s);
    }
}
