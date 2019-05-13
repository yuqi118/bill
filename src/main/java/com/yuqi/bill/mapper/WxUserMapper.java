package com.yuqi.bill.mapper;

import com.yuqi.bill.model.WxUser;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2019/05/06
*/
@Mapper
public interface WxUserMapper {
    int deleteByPrimaryKey(String wx_id);

    int insert(WxUser record);

    int insertSelective(WxUser record);

    WxUser selectByPrimaryKey(String wx_id);

    int updateByPrimaryKeySelective(WxUser record);

    int updateByPrimaryKey(WxUser record);
}