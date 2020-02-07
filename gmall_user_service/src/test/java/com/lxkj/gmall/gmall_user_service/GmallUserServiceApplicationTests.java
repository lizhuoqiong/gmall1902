package com.lxkj.gmall.gmall_user_service;


import com.lxkj.gmall.service.UmsMemberReceiveAddressService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallUserServiceApplicationTests {

    @Autowired
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;
    @Test
    void contextLoads() {
        System.out.println(umsMemberReceiveAddressService.getUserAll().size());
    }

}
