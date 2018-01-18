package kaola.com.study.course02.after;

/**
 * @Author:zouw
 * @Description: 创建所有媒体的公共部分作为基类
 * @Date:Created in 15:01 2018/1/18
 * @Modified By:
 */
public class Item {

    protected String title;
    protected int numofTracks;
    protected int playingTime;
    protected boolean gotIt=false;
    protected String comment;
    public void print() {
        System.out.println("item..item");
    }

    public Item(String title, int numofTracks, int playingTime, String comment) {
        this.title = title;
        this.numofTracks = numofTracks;
        this.playingTime = playingTime;
        this.comment = comment;
    }
    public Item() {
    }
}
