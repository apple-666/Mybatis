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

//    List<Box> getBox();

    Box getBox(@Param("boxid") int id);

    List<Box> getBox2();
}
