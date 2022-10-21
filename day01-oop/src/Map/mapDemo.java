package Map;

import java.util.HashMap;
import java.util.Map;

public class mapDemo {
    public static void main(String[] args) {

        //创建map集合对象
        Map<String,String> m=new HashMap<>();

        //添加元素
        //添加有两个功能，添加和覆盖
        //在添加数据时，如果键存在，则覆盖原值，并把被覆盖的值返回
        //如果键不存在，返回null
        m.put("ab","12");
        m.put("cd","34");
        m.put("ef","56");

       //删除
        //String result=m.remove("ef");
        //System.out.println(result);

        //清空
        //m.clear();

        //是否包含，通过键和值都有可以
        //boolean keyResult=m.containsKey("ab");
        //System.out.println(keyResult);

        //boolean valueResult=m.containsValue("ab");
        //System.out.println(valueResult);

        //判断是否为空
        //boolean result=m.isEmpty();
        //System.out.println(result);

        //返回长度
        int size=m.size();
        System.out.println(size);
        System.out.println(m);

    }
}
