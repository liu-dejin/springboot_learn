package cn.kis2.controller;

import cn.kis2.Pojo.Emp;
import cn.kis2.Pojo.Result;
import cn.kis2.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @RequestMapping("/listEmp")
    public Result list (){
        //1.加载并解析xml
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        //2.对数据进行转换 -gender -job
        empList.stream().forEach(emp -> {
            String gender = emp.getGender();
            //判断男女
            if ("1".equals(gender)){
                emp.setGender("男");
            }else if ("2".equals(gender)){
                emp.setGender("女");
            }

            //处理job
            String job = emp.getJob();
            if ("1".equals(job)){
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            } else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }
        });
        //3.响应数据
        return Result.success(empList);
    }
}
