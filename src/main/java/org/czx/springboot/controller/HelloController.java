package org.czx.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ASUS on 2018/5/12.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("hi")
    @ResponseBody
    public String sayHello(){
        return "Hello";
    }
}
