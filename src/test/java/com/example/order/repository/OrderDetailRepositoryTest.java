package com.example.order.repository;

import com.example.order.OrderApplicationTests;
import com.example.order.entity.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

@Component
public class OrderDetailRepositoryTest extends OrderApplicationTests {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void testSave(){
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setCreateTime(new Date());
        orderDetail.setDetailId("4521454");
        orderDetail.setOrderId("316142");
        orderDetail.setProductIcon("");
        orderDetail.setProductId("1123232132");
        orderDetail.setProductName("猪肉脯");
        orderDetail.setProductPrice(19);
        orderDetail.setProductQuantity(2);
        orderDetail.setUpdateTime(new Date());
        OrderDetail orderDetail1=orderDetailRepository.save(orderDetail);
        Assert.assertTrue(orderDetail != null);
    }

}