package com.lxkj.gmall.gmall_manage.service.impl;

import com.lxkj.gmall.bean.PmsBaseCatalog1;
import com.lxkj.gmall.gmall_manage.mapper.PmsBaseCatalog1Mapper;
import com.lxkj.gmall.gmall_manage.mapper.PmsBaseCatalog2Mapper;
import com.lxkj.gmall.gmall_manage.mapper.PmsBaseCatalog3Mapper;
import com.lxkj.gmall.service.CatalogService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Autowired
    private PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Autowired
    private PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return pmsBaseCatalog1Mapper.selectAll();
    }
}
