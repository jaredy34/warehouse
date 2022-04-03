package com.jared.warehouse.vendor.vendororderproducer.controller;

import com.jared.warehouse.vendor.vendororderproducer.model.VendorOrder;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vendor/order")
public class VendorOrderController {
    
    @PostMapping(value = "/")
    public VendorOrder submitOrder(VendorOrder request) {
        return request;
    }
}
