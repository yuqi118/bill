package com.yuqi.bill.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
* Created by Mybatis Generator 2019/05/06
*/
@Data
public class Bill implements Serializable {
    private String bill_id;

    private String yunfei;

    private String zongjine;

    private String addDate;

    private String addUser;

    private List<BillItem> billItems;


    private static final long serialVersionUID = 1L;
}