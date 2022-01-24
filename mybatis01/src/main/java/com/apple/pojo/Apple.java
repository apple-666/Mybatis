package com.apple.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Double_apple
 * @Date 2022/1/24 21:47
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apple {
    private int id;
    private String name;
    private int color;
}
