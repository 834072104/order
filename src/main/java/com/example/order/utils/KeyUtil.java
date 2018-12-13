package com.example.order.utils;

import java.util.Random;

public class KeyUtil {

    /*
    * 简单的生成唯一的主键类，并不能保证百分百唯一
    * 格式：时间+随机数
    * */
    public static synchronized String genUniqueKey(){

        Random random=new Random();
        Integer number=random.nextInt(900000)+100000; //生成6位随机数

        return System.currentTimeMillis()+String.valueOf(number);
    }
}
