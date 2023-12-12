package cn.kis2.test2;

public class GouZaoMethodTest {
    public static void main(String[] args) {
        //创建对象
        //调用对象的空参构造

//        GouZaoMethod g1 = new GouZaoMethod();


        //有参无参,方法名相同就形成了重载

        //推荐:无论使用与否,都把无参有参的都写上
        GouZaoMethod g = new GouZaoMethod("张三",33);

        System.out.println(g.getName());
        System.out.println(g.getAge());
    }
}

