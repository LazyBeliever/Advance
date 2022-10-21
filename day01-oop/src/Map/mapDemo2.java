package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * map集合遍历方法1
 */
public class mapDemo2 {
    public static void main(String[] args) {


        //创建map对象
        Map<String,String> map=new HashMap<>();

        //添加元素
        map.put("12","ab");
        map.put("34","cd");
        map.put("56","ef");

        //一通过键找值
        Set<String> keys=map.keySet();
        //遍历单列集合得到每一个键值(三个方法)
        //1 迭代器
        //keys.iterator();

        //2 增强for
        for (String key : keys) {
            System.out.println(key);
            //利用map集合中的键获取对应的值 get
            String value=map.get(key);
            System.out.println(value);
        }

        //3 lambda表达式方法
        //keys.forEach();



        //二，通过键值对（键值对对象）（entry）



    }
}
