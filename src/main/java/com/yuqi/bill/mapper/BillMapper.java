package com.yuqi.bill.mapper;

import com.yuqi.bill.model.Bill;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2019/05/06
*/
@Mapper
public interface BillMapper {
    int deleteByPrimaryKey(String bill_id);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(String bill_id);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
}