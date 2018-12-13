package com.example.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    /*
    * 1.参数校验
    * 2.查找商品（调用service服务）
    * 3.计算总价
    * 4.商品扣库存
    * 5.订单入库
    * */
    public void create(){

    }
}
