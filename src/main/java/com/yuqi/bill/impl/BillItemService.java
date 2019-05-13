package com.yuqi.bill.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yuqi.bill.model.BillItem;
import com.yuqi.bill.mapper.BillItemMapper;

@Service
public class BillItemService{

    @Resource
    private BillItemMapper billItemMapper;

    public int deleteByPrimaryKey(String bill_item_id){
        return billItemMapper.deleteByPrimaryKey(bill_item_id);
    }

    public int insert(BillItem record){
        return billItemMapper.insert(record);
    }

    public int insertSelective(BillItem record){
        return billItemMapper.insertSelective(record);
    }

    public BillItem selectByPrimaryKey(String bill_item_id){
        return billItemMapper.selectByPrimaryKey(bill_item_id);
    }

    public int updateByPrimaryKeySelective(BillItem record){
        return billItemMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(BillItem record){
        return billItemMapper.updateByPrimaryKey(record);
    }

}
