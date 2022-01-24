package com.apple.dao;

import com.apple.pojo.Apple;

import java.util.List;
import java.util.Map;

/**
 * @Author Double_apple
 * @Date 2022/1/24 21:47
 * @Version 1.0
 */

public interface AppleDao {
    //查
    List<Apple> listApple();

    //增
    int addApple(Apple apple);

    //删
    int delApple(int id);

    //改
    int updApple(Apple apple);

    // id 查
    Apple queryApple(int id);

    //使用万能map 插入
    int addAppleMap(Map<String,Object> map);

    //使用模糊查询
    List<Apple> queryAppleLike(String key);

}
