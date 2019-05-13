package com.yuqi.bill.model;

import java.io.Serializable;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/05/06
*/
@Data
public class BillItem implements Serializable {
    private String bill_item_id;

    private String xinghao;

    private String shuliang;

    private String danjia;

    private String hejijine;

    private String addDate;

    private String xuhao;

    private String bill_id;


}