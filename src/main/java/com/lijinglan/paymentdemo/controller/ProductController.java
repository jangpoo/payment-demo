package com.lijinglan.paymentdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) 2022 zengyunning All Rights Reserved
 * Project: payment-demo
 * Package: com.lijinglan.paymentdemo.controller
 * Version: V1.0
 * Desc:
 * Create by zengyunning on 2022/01/16 23:30
 */

@RestController // 保证当前接口/Controller中所有方法的返回值（若有），以JSON形式数据返回
@RequestMapping("/api/product")
public class ProductController {

    @GetMapping("/test")
//    @RequestMapping("/test1")
    public String test() {
        System.out.println("test invoke");
        return "test";
    }

}
