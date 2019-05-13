package com.yuqi.bill.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.yuqi.bill.model.WxUser;
import com.yuqi.bill.mapper.WxUserMapper;

@Service
public class WxUserService{

    @Resource
    private WxUserMapper wxUserMapper;

    public int deleteByPrimaryKey(String wx_id){
        return wxUserMapper.deleteByPrimaryKey(wx_id);
    }

    public int insert(WxUser record){
        return wxUserMapper.insert(record);
    }

    public int insertSelective(WxUser record){
        return wxUserMapper.insertSelective(record);
    }

    public WxUser selectByPrimaryKey(String wx_id){
        return wxUserMapper.selectByPrimaryKey(wx_id);
    }

    public int updateByPrimaryKeySelective(WxUser record){
        return wxUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(WxUser record){
        return wxUserMapper.updateByPrimaryKey(record);
    }

}
