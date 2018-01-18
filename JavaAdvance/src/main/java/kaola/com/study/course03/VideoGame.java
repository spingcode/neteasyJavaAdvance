package kaola.com.study.course03;

import kaola.com.study.course02.after.Item;

/**
 * @Author:zouw
 * @Description:
 * @Date:Created in 16:44 2018/1/18
 * @Modified By:
 */
public class VideoGame extends Item{
    private int numberPlayers;

    public VideoGame(String title, int numofTracks, int playingTime, String comment, int numberPlayers) {
        super(title, numofTracks, playingTime, comment);
        this.numberPlayers = numberPlayers;
    }

    public VideoGame() {
        super();
    }

    @Override
    public void print() {
        System.out.println("VideoGame");
    }
}
