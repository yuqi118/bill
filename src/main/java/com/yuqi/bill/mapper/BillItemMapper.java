package com.yuqi.bill.mapper;

import com.yuqi.bill.model.BillItem;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2019/05/06
*/
@Mapper
public interface BillItemMapper {
    int deleteByPrimaryKey(String bill_item_id);

    int insert(BillItem record);

    int insertSelective(BillItem record);

    BillItem selectByPrimaryKey(String bill_item_id);

    int updateByPrimaryKeySelective(BillItem record);

    int updateByPrimaryKey(BillItem record);
}