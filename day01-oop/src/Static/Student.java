package Static;

public class Student {

    private String name;

    /**
     * 静态成员方法：有static 修饰，归属于类，可以被共享访问，用类名或者对象名都可以访问
     * @param age1
     * @param age2
     * @return
     */
    public static int getMax(int age1,int age2){
        return age1>age2?age1:age2;
    }

    /**
     * 实例方法：属于对象，只能用对象触发访问
     */
    public void study(){
        System.out.println(name+"好好学习天天向上");
    }

    public static void main(String[] args){
        //1.类名，静态成员方法
        System.out.println(Student.getMax(10,3));
        //同一个类中，访问静态成员方法，类名可以不写
        System.out.println(getMax(10,32));

        //语法上支持通过对象调用静态方法，但是不推荐这样做，推荐直接用类名调用
        //静态方法优先加载

    }
}

