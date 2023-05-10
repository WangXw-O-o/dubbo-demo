package com.wxw.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wxw.dubbo.facade.DubboTestFacade;
import com.wxw.dubbo.facade.model.DubboTestRequest;
import com.wxw.dubbo.facade.model.DubboTestResponse;

@Service(version = "1.0.0", timeout = 3000)
public class DubboTestFacadeService implements DubboTestFacade {
    @Override
    public DubboTestResponse test(DubboTestRequest request) {
        System.out.println(">>>>>DubboTestFacadeService test>>>>>");
        DubboTestResponse response = new DubboTestResponse();
        response.setResult("dubbo test provider: " + request.getParam());
        return response;
    }
}
