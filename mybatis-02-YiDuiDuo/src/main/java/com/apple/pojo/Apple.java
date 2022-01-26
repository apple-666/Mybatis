package com.apple.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;

/**
 * @Author Double_apple
 * @Date 2022/1/24 21:47
 * @Version 1.0
 */
@Data
public class Apple {
    private int id;
    private String name;
    private int color;

//    private Box box;
    private int boxid;
}
