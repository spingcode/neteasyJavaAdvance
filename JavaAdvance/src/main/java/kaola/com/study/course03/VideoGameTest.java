package kaola.com.study.course03;

import kaola.com.study.course02.after.DataBaseNew;

/**
 * @Author:zouw
 * @Description:
 * @Date:Created in 16:46 2018/1/18
 * @Modified By:
 */
public class VideoGameTest {
    public static void main(String[] args) {
        DataBaseNew dbn = new DataBaseNew();
        dbn.add(new VideoGame());
        dbn.add(new VideoGame());
        dbn.list();
    }
}
