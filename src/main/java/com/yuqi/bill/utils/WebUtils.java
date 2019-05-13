package com.yuqi.bill.utils;

/**
 * @Description: TODO
 * @Author: Hardy
 * @DateTime: 2019/5/7 18:19
 * @Verstion 1.0
 */
public class WebUtils {


    public void checkNumber(int num) throws Exception {
        if(!(num >0)){
            throw new Exception("数据新增失败");
        }
    }
}
