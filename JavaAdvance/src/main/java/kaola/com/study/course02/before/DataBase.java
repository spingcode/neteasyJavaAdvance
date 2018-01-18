package kaola.com.study.course02.before;

import java.util.ArrayList;

/**
 * @Author:zouw
 * @Description: 不使用继承进行存储各种媒体
 * @Date:Created in 14:43 2018/1/18
 * @Modified By:
 */
public class DataBase {
    private ArrayList<CD> listCD = new ArrayList<>();
    private ArrayList<DVD> listDVD = new ArrayList<>();
    public void add(CD cd)
    {
        listCD.add(cd);
    }
    public void add(DVD dvd)
    {
        listDVD.add(dvd);
    }
    public void list()
    {
        for (CD cd:listCD)
        {
            cd.print();
        }
    }

    public static void main(String[] args) {
        DataBase db = new DataBase();
        db.add(new CD());

    }
}
