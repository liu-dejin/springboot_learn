package cn.kis2.test2;

public class GouZaoMethod {
    //和类名相同
    //没有返回值类型,void都没有
    //没有具体的返回值(不能return结果)

    //成员变量用private修饰
    private String name;
    private int age;


    //如果我们自己没有写任何的构造方法
    //那么虚拟机给我们加一个空参构造方法


    //无参/含参
    //如果有了构造方法,默认的无参不再有效,需要手动添加无参数构造器
/*    public GaoZaoMethod(){
        System.out.println("看看我执行了吗？");
    }*/
    public GouZaoMethod(String name, int age){
        this.name = name;
        this.age = age;
    }


    //需要对应的set和get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
