package com.lxkj.gmall.gmall_itme_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

    @RequestMapping("/item")
    public String item(){
        return "item";
    }
}
