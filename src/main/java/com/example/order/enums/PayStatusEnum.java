package com.example.order.enums;

import lombok.Getter;

@Getter
public enum PayStatusEnum {
    WAITPAY(0,"未支付"),
    SUCCESS(1,"已支付");
    private Integer code;
    private String msg;

    PayStatusEnum(Integer code,String msg) {
        this.code = code;
        this.msg =msg;
    }
}
