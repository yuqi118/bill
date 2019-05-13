package com.yuqi.bill.impl;

import com.google.common.base.Preconditions;
import com.yuqi.bill.mapper.BillItemMapper;
import com.yuqi.bill.model.BillItem;
import com.yuqi.bill.utils.IdUtils;
import lombok.val;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import com.yuqi.bill.model.Bill;
import com.yuqi.bill.mapper.BillMapper;

@Service
@val
public class BillService{

    @Resource
    private BillMapper billMapper;

    @Resource
    private BillItemMapper billItemMapper;

    public int deleteByPrimaryKey(String bill_id){
        return billMapper.deleteByPrimaryKey(bill_id);
    }


    /**
     * 新增出库账单
     * @param record
     * @return
     */
    public int insert(Bill record){

        List<BillItem> list=new ArrayList<>();
        list=record.getBillItems();
        //创建订单
        record.setBill_id(IdUtils.create());
        if(billMapper.insert(record)>0){
            Preconditions.checkNotNull("订单详情为空");
            //新增账单明细
            record.getBillItems().forEach(billItem -> {
                billItem.setBill_item_id(IdUtils.create());
                billItemMapper.insert(billItem);

            });
        }
        ///Preconditions.
        return 1;
    }

    public int insertSelective(Bill record){
        return billMapper.insertSelective(record);
    }

    public Bill selectByPrimaryKey(String bill_id){
        return billMapper.selectByPrimaryKey(bill_id);
    }

    public int updateByPrimaryKeySelective(Bill record){
        return billMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Bill record){
        return billMapper.updateByPrimaryKey(record);
    }



}
