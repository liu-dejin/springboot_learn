package cn.kis2.test1;

import sun.java2d.pipe.SpanIterator;

import java.net.SocketTimeoutException;

public class objectFengZhuang {

    private String name;    //private 只能在本类才能访问
    private int age;
    private String gender;

    private int age1; //0
    public void method (){
        int age1 = 19;
        System.out.println(age1); //19
        System.out.println(this.age1);  //0 this 访问成员变量
    }


    //针对于私有化的成员变量,都要提供set和get方法
    //为成员name赋值
    public void setName(String name) {
        //局部变量表示测试类中调用方法传过来的数据
        //等号左边是成员变量的name
        this.name = name;
    }

    //对外提供name属性
    public String getName() {
        return name;
    }

    //age
    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("非法参数");
        }
    }

    public int getAge() {
        return age;
    }

    //gender
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender (){
        return gender;
    }



    //行为
    public void sleep() {
        System.out.println("女仆在睡觉");
    }

    public void eat() {
        System.out.println("女仆在吃法n");
    }


}

