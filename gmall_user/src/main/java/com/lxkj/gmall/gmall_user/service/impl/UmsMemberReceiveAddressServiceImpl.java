package com.lxkj.gmall.gmall_user.service.impl;

import com.lxkj.gmall.bean.UmsMemberReceiveAddress;
import com.lxkj.gmall.gmall_user.mapper.UmsMemberReceiveAddressMapper;
import com.lxkj.gmall.service.UmsMemberReceiveAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {

    @Resource
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMemberReceiveAddress> getUserAll() {
        return umsMemberReceiveAddressMapper.getUserAll();
    }
}
