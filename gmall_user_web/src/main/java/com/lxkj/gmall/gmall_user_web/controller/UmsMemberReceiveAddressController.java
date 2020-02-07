package com.lxkj.gmall.gmall_user_web.controller;

import com.lxkj.gmall.service.UmsMemberReceiveAddressService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UmsMemberReceiveAddressController {

    @Resource
    private UmsMemberReceiveAddressService memberReceiveAddressService;

    @RequestMapping(value = "/index")
    @ResponseBody
    public Object index(){
        System.out.println(memberReceiveAddressService.getUserAll().size());
        return memberReceiveAddressService.getUserAll();
    }
}
