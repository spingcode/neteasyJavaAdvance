package kaola.com.study.course02.after;

import java.util.ArrayList;

/**
 * @Author:zouw
 * @Description: 使用继承之后创建媒体存储库
 * @Date:Created in 15:03 2018/1/18
 * @Modified By:
 */
public class DataBaseNew {
    private ArrayList<Item> itemList = new ArrayList<>();
    public void add(Item it)
    {
        itemList.add(it);
    }
    public void list()
    {
        for (Item it:itemList)
        {
            it.print();
        }
    }
    public static void main(String[] args) {
        DataBaseNew dbn = new DataBaseNew();
        dbn.add(new CD());
        dbn.add(new DVD());
        dbn.list();
    }
}
