package com.jared.warehouse.vendor.vendororderproducer.model;

import lombok.Data;

@Data
public class VendorOrderLineItem {
    private String id;
    private String name;
    private int quantity;
    private double price;
}
