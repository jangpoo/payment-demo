package com.lijinglan.paymentdemo.vo;

import lombok.Data;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (c) 2022 zengyunning All Rights Reserved
 * Project: payment-demo
 * Package: com.lijinglan.paymentdemo.vo
 * Version: V1.0
 * Desc:
 * Create by zengyunning on 2022/01/18 16:00
 */

@Data
public class R {

    private Integer code;   // 响应码
    private String message; // 响应消息
    private Map<String, Object> data = new HashMap<>();   // 后台返回给前端请求的数据

    public static R ok() {
        R r = new R();
        r.setCode(0);
        r.setMessage("成功");

        return r;
    }

    public static R error() {
        R r = new R();
        r.setCode(-1);
        r.setMessage("失败");

        return r;
    }

    /*
    public static R data() {
        R r = new R();
//        r.setData("123", "fdsa"); // 注意：这里data的value无法使用String类型，而String的父类确实是Object；但test包中测试通过
//        r.setData(new HashMap<>().put("123", "fas"));
//        r.setData(r.data.put("123", "fas"));

        return r;
    }
    */
    public R data(String key, Object value) {
        this.data.put(key, value);

        return this;
    }
}
