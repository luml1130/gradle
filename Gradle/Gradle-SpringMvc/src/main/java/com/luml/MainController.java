package com.luml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author luml
 * @description
 * @date 2020/4/6 18:57
 */
@Controller
public class MainController {

    @RequestMapping("/hello")
    public String Hello(){
        System.out.println("-------我进来了----------");
        return "index";
    }
}
