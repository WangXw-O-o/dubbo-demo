package com.wxw.dubbo.facade.model;

import java.io.Serializable;

public class DubboTestRequest implements Serializable {
    private static final long serialVersionUID = 6446862697485483020L;

    private String param;

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
