package cn.tedu.controller;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/save")
    public String save(){
        System.out.println("user save...");
        return "{'info':'user save}";
    }
}
