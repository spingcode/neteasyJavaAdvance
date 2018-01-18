package kaola.com.study.course03;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author:zouw
 * @Description:查看object的方法
 * @Date:Created in 16:34 2018/1/18
 * @Modified By:
 */
public class ObjectFeature {
    public static void main(String[] args) {
        Object o = new Object();
        for (Method m :o.getClass().getDeclaredMethods())
            System.out.println(m);
    }
}
