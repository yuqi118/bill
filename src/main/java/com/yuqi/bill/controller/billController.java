package com.yuqi.bill.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.yuqi.bill.filter.HttpResponse;
import com.yuqi.bill.impl.BillItemService;
import com.yuqi.bill.impl.BillService;
import com.yuqi.bill.model.Bill;
import com.yuqi.bill.model.BillItem;
import com.yuqi.bill.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: Hardy
 * @DateTime: 2019/5/6 18:15
 * @Verstion 1.0
 */
@RestController
public class billController {

    @Autowired
    private BillService billService;

    @Autowired
    private BillItemService billItemService;


    @RequestMapping("/insert")
    public HttpResponse insertBill(@RequestBody Bill bill){
        return  new HttpResponse(billService.insert(bill));
    }

    @RequestMapping("/tset")
    public HttpResponse insertBill2(@RequestBody String s){
        System.out.println(s);
        return  new HttpResponse();
    }

    @RequestMapping("/saveUser")
    public HttpResponse saveUser(@RequestBody User user, BindingResult result) {
        System.out.println(user);
        return new HttpResponse();
    }
}
