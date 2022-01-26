package com.apple.dao;

import com.apple.pojo.Box;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Double_apple
 * @Date 2022/1/26 12:16
 * @Version 1.0
 */
public interface BoxDao {

    List<Box> listBox();

    //结果查询
    Box getBox(@Param("boxid") int id);

    //子查询
    Box getBox2(@Param("boxid") int id);
}
