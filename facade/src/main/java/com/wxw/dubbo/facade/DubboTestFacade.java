package com.wxw.dubbo.facade;

import com.wxw.dubbo.facade.model.DubboTestRequest;
import com.wxw.dubbo.facade.model.DubboTestResponse;

public interface DubboTestFacade {

    DubboTestResponse test(DubboTestRequest request);

}
