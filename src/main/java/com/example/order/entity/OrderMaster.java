package com.example.order.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class OrderMaster {

    @Id
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyer_address;
    private String buyer_openid;
    private BigDecimal order_amount;
    private Integer order_status;
    private Integer pay_status;
    private Date create_time;
    private Date update_time;
}
