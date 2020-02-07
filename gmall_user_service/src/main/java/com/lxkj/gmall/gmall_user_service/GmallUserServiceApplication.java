package com.lxkj.gmall.gmall_user_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lxkj.gmall.gmall_user_service.mapper")
public class GmallUserServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(GmallUserServiceApplication.class, args);
        try {
            //阻塞作用，否则会由于不是web项目，执行main方法后立即停止服务。
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
