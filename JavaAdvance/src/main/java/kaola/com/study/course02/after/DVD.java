package kaola.com.study.course02.after;

/**
 * @Author:zouw
 * @Description:
 * @Date:Created in 15:31 2018/1/18
 * @Modified By:
 */
public class DVD extends Item {
    private String director;

    public DVD(String title, int numofTracks, int playingTime, String comment, String director) {
        super(title, numofTracks, playingTime, comment);
        this.director = director;
    }

    public DVD() {
        super();
    }

    @Override
    public void print() {
        System.out.println("DVD");
    }
}
