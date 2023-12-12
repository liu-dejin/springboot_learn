package cn.kis2.test1;

import com.sun.xml.internal.ws.api.message.MessageWritable;

import java.sql.SQLOutput;

public class StringDome1 {
    public static void main(String[] args) {

        //字符串创建后不能更改

        //创建字符串对象
        //1.直接赋值
        String name = "刘德华";

        System.out.println(name);


        //2.new关键字
        String name2 = new String();
        System.out.println("@"+ name2);  // ""

        //传递一个字符数组
        String name3 = new String("abc");
        System.out.println(name3);

        //传递一个字符数组
        //修改字符串的内容  abc --> QBC
        //abc --> {'a','b','c'} -->{'Q','B','C'} -->"QBC"
        char[] chs = {'a','b','c','d'};
        String name4 = new String(chs);
        System.out.println(name4); //abcd


        //传递一个字节数组
        byte[] bytes = {97,98,99,100};
        String name5 = new String(bytes);
        System.out.println(name5);  //abcd


    }

}
