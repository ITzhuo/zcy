package com.zcy.springboot.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/user/detail")
    public @ResponseBody String detail(){

        return "/user/detail";
    }

    @RequestMapping("/center")
    public  @ResponseBody String center(){

        return "center";

    }

}
