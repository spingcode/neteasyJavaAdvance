package kaola.com.study.course01.notbook;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author:zouw
 * @Description:使用ArrayList实现笔记本的实现类
 * @Date:Created in 22:35 2018/1/17
 * @Modified By:
 */
public class NoteBookImpl implements NoteBook {
    private ArrayList<String> notes = new ArrayList<String>();
    //private int size=0;
    @Override
    public void add(String note) {
        notes.add(note);
        //size++;
    }

    @Override
    public void add(String note, int location) {
        notes.add(location,note);
    }

    @Override
    public int getSize() {
        return notes.size();
    }

    @Override
    public String getNote(int index) {
        return notes.get(index);
    }

    @Override
    public  void removeNote(int index) {
        notes.remove(index);
    }

    @Override
    public String[] list() {
        return notes.toArray(new String[0]);
    }
    public static <T> void print(T s)
    {
        System.out.println(s);
    }
    public static void main(String[] args) {
        NoteBook notebook = new NoteBookImpl();
        notebook.add("first");
        notebook.add("second");
        notebook.add("thrid",1);
        print(notebook.getSize());
        print(notebook.getNote(0));
        print(notebook.getNote(1));
        notebook.removeNote(1);
        String[] array = notebook.list();
        for (String s:array)
        {
            print(s);
        }
    }
    //4、对象数组
    @Test
    public void ObjectArray()
    {
        int[] ia = new int[10];
        String[] a = new String[10];
        print(ia[0]+2);
        print(a[0]+"a");
        //a[0]=null
        //print(a[0].length());
        for (int i = 0; i < 10; i++) {
            a[i]=""+i;
        }
        print(a[0].length());
    }
    //for-each
    @Test
    public void ForEachFeature()
    {
        value[] values = new value[10];
        for (int i = 0; i < values.length; i++) {
            values[i]=new value();
            values[i].setI(i);
        }
        print(Arrays.toString(values));
        for (value v:values)
        {
            v.setI(0);
        }
        print(Arrays.toString(values));


        ArrayList<String> a=new ArrayList<>();
        a.add("first");
        a.add("second");
        for (String s:a)
        {
            print(s);
        }
    }


}
class value{
    private int i;
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return ""+i;
    }
}