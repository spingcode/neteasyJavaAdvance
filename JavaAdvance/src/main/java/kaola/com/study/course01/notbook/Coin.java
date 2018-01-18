package kaola.com.study.course01.notbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author:zouw
 * @Description:Hash表
 * @Date:Created in 14:14 2018/1/18
 * @Modified By:
 */
public class Coin {
    private HashMap<Integer,String> coinnames = new HashMap<>();

    public Coin() {
        coinnames.put(1,"penny");
        coinnames.put(10,"dime");
        coinnames.put(25,"quarter");
        coinnames.put(50,"half-dolar");
        Set<Map.Entry<Integer, String>> entries = coinnames.entrySet();
        for (Map.Entry<Integer,String> e:entries)
        {
            Integer key = e.getKey();
            String value = e.getValue();
            System.out.println(key+":"+value);
        }
    }

    public String getName(int amount)
    {
        return coinnames.get(amount);
    }

    public static void main(String[] args) {
        Coin coin = new Coin();
        Scanner in= new Scanner(System.in);
        int amount = in.nextInt();
        System.out.println(coin.getName(amount));
        in.close();
    }
}
