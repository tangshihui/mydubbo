package com.tsh.serviceprovider;

import com.alibaba.dubbo.config.annotation.Service;
import com.tsh.service.CityService;

@Service
public class CityServiceImpl implements CityService {
    @Override
    public String getShenghui(String provence) {
        return "你输入的省份是:" + provence;
    }
}
