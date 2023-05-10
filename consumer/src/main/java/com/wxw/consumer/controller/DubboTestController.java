package com.wxw.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wxw.dubbo.facade.DubboTestFacade;
import com.wxw.dubbo.facade.model.DubboTestRequest;
import com.wxw.dubbo.facade.model.DubboTestResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboTestController {

    @Reference(version = "1.0.0", timeout = 3000)
    private DubboTestFacade dubboTestFacade;

    @RequestMapping("/dubbo/test")
    public String dubboTest() {
        DubboTestRequest request = new DubboTestRequest();
        request.setParam("consumer test");
        DubboTestResponse test = dubboTestFacade.test(request);
        return "/dubbo/test : " + test.getResult();
    }

}
