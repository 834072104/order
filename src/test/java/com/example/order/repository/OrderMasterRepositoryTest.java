package com.example.order.repository;

import com.example.order.OrderApplicationTests;
import com.example.order.entity.OrderMaster;
import com.example.order.enums.OrderMasterEnmu;
import com.example.order.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

@Component
public class OrderMasterRepositoryTest extends OrderApplicationTests {
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave(){
        OrderMaster orderMaster=new OrderMaster();
        orderMaster.setOrderId("123456");
        orderMaster.setBuyer_address("深圳");
        orderMaster.setBuyer_openid("123123");
        orderMaster.setBuyerName("mon");
        orderMaster.setBuyerPhone("19355661211");
        orderMaster.setCreate_time(new Date());
        orderMaster.setOrder_amount(new BigDecimal(9.9));
        orderMaster.setOrder_status(OrderMasterEnmu.INIT.getCode());
        orderMaster.setPay_status(PayStatusEnum.WAITPAY.getCode());
        orderMaster.setUpdate_time(new Date());

        OrderMaster orderMaster1=orderMasterRepository.save(orderMaster);
        Assert.assertTrue(orderMaster1 != null);

    }

}