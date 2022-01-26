package com.apple.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author Double_apple
 * @Date 2022/1/25 19:50
 * @Version 1.0
 */
@Data
public class Box {
    int id;
    int size;

    List<Apple> apples;
}
