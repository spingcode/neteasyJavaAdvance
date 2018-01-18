package kaola.com.study.course01;

/**
 * @Author:zouw
 * @Description:创建笔记本接口
 * @Date:Created in 22:32 2018/1/17
 * @Modified By:
 */
public interface NoteBook {
    public void add(String note);
    public void add(String note,int location);
    public int getSize();
    public String getNote(int index);
    public void removeNote(int index);
    public String[] list();
}
