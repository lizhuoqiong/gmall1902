package com.lxkj.gmall.gmall_user.controller;

import com.lxkj.gmall.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UmsMemberReceiveAddressController {

    @Autowired
    private UmsMemberReceiveAddressService memberReceiveAddressService;

    @RequestMapping(value = "/index")
    @ResponseBody
    public Object index(){
        return memberReceiveAddressService.getUserAll();
    }
}
