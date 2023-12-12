package cn.kis2.test1;

public class objectFengZhuangTest {
    public static void main(String[] args) {
        objectFengZhuang gf1 = new objectFengZhuang();
            gf1.setName("小甜甜");
            gf1.setAge(18);
            gf1.setGender("男");


        System.out.println(gf1.getAge());
        System.out.println(gf1.getName());
        System.out.println(gf1.getGender());

        gf1.sleep();
        gf1.eat();
        gf1.method();
    }
}
