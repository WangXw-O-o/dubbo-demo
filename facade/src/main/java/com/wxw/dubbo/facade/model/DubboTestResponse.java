package com.wxw.dubbo.facade.model;

import java.io.Serializable;

public class DubboTestResponse implements Serializable {
    private static final long serialVersionUID = -5004837635550316005L;

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
