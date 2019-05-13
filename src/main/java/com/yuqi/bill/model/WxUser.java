package com.yuqi.bill.model;

import java.io.Serializable;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/05/06
*/
@Data
public class WxUser implements Serializable {
    private String wx_id;

    private String wx_name;

    private static final long serialVersionUID = 1L;
}