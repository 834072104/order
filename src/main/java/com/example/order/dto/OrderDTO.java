package com.example.order.dto;

import com.example.order.entity.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

//订单的数据传输对象
@Data
public class OrderDTO {

    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyer_address;
    private String buyer_openid;
    private BigDecimal order_amount;
    private Integer order_status;
    private Integer pay_status;
    private List<OrderDetail> orderDetailList;

}
