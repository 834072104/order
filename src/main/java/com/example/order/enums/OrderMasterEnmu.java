package com.example.order.enums;

import com.example.order.entity.OrderMaster;
import lombok.Getter;

@Getter
public enum OrderMasterEnmu {
    INIT(0,"新订单"),
    FINISHED(1,"完成"),
    CANCEL(2,"取消");
    private Integer code;
    private String msg;

    OrderMasterEnmu(Integer code,String msg) {
        this.code = code;
        this.msg =msg;
    }
}
