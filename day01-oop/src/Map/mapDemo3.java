package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * map集合遍历方法2
 */
public class mapDemo3 {
    public static void main(String[] args) {


        //1 创建map对象
        Map<String,String> map=new HashMap<>();

        //2 添加元素
        map.put("12","ab");
        map.put("34","cd");
        map.put("56","ef");

        //通过键值对对象访问
        //3.1 通过一个方法获取所有的键值对对象，返回一个Set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();

        //像下面一样写也行，但是要导包，import java.util.Map.Entry;
        //Set<Entry<String, String>> entries = map.entrySet();

        //3.2遍历entries这个集合，去得到里面的每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {
            //3.3 利用entry调用get方法获取键和值
            String key=entry.getKey();
        }



    }
}
