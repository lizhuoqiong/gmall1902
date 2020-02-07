package com.lxkj.gmall.gmall_manage;

import com.lxkj.gmall.service.CatalogService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@SpringBootConfiguration
class GmallManageServiceApplicationTests {

    @Resource
    private CatalogService catalogService;

    @Test
    void contextLoads() {
        System.out.println(1111);
        System.out.println(catalogService.getCatalog1().size());
    }

}
