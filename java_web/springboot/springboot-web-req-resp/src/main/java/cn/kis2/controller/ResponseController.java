package cn.kis2.controller;

import cn.kis2.Pojo.Address;
import cn.kis2.Pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {
    @RequestMapping("/hello")
    public Result hello(){
        System.out.println("hello");
    // return new Result(1,"success","Hello World ~");
        return Result.success("hello");
    }

    @RequestMapping("/getAddr")
    public Result getAddr(){
        Address addr = new Address();
        addr.setProvince("陕西省");
        addr.setCity("西安");
        return Result.success(addr);
    }

    @RequestMapping("/listAddr")
    public List<Address> listAddr(){
        List<Address> list = new ArrayList<>();

        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");

        Address addr2 = new Address();
        addr2.setProvince("陕西");
        addr2.setCity("西安");

        list.add(addr);
        list.add(addr2);
        return list;
    }
}
