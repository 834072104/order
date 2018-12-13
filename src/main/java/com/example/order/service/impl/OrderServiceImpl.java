package com.example.order.service.impl;

import com.example.order.dto.OrderDTO;
import com.example.order.entity.OrderMaster;
import com.example.order.enums.OrderMasterEnmu;
import com.example.order.enums.PayStatusEnum;
import com.example.order.repository.OrderDetailRepository;
import com.example.order.repository.OrderMasterRepository;
import com.example.order.service.OrderService;
import com.example.order.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {

        //订单入库
        OrderMaster orderMaster=new OrderMaster();
        orderDTO.setOrderId(KeyUtil.genUniqueKey());
        BeanUtils.copyProperties(orderDTO,orderMaster);
        orderMaster.setOrder_status(OrderMasterEnmu.INIT.getCode());
        orderMaster.setPay_status(PayStatusEnum.WAITPAY.getCode());
        orderMaster.setOrder_amount(new BigDecimal(5));
        orderMaster.setCreate_time(new Date());

        orderMasterRepository.save(orderMaster);
        return orderDTO;
    }
}
