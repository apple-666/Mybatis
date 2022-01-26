package com.apple.utils;

import java.util.UUID;

/**
 * @Author Double_apple
 * @Date 2022/1/26 18:41
 * @Version 1.0
 */
@SuppressWarnings("all") //抑制警告
public class IDutils {

    public static String getId(){
        return UUID.randomUUID().toString();
    }
}
