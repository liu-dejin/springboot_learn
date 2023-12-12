package cn.kis2.controller;

import cn.kis2.Pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class RequestController {
    @RequestMapping("/simpleParam")
    public String simpleParam(HttpServletRequest request) {
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");

        int age = Integer.parseInt(ageStr);

        System.out.println(name + ":" + age);
        return "OK";
    }


    //2.实体参数

    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "ok";
    }

    //复杂实体参数
    @RequestMapping("/complexPojo")
    public String complexPojo(User user){
        System.out.println(user);
        return "OK";
    }

    //数组请求
    //请求参数名和形参中数组变量名相同,可以直接使用数组封装
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }

    //集合请求
    //请求参数名和形参中数组变量名相同,通过@RequestParam绑定参数关系
    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return "OK";
    }


    //日期参数
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime ){
        System.out.println(updateTime);
        return "OK";
    }

    //JSON 参数
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }

    //路径参数
    @RequestMapping("/path/{id}")
    public String pathParam2(@PathVariable Integer id){
        System.out.println(id);
        return "ok";
    }



    @RequestMapping("/path/{id}/{name}")
    public String pathParam2(@PathVariable Integer id,@PathVariable String name){
        System.out.println(id+":"+name);
        return "ok";
    }

}


