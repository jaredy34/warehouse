package com.jared.warehouse.vendor.vendororderproducer.model;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VendorOrder {
    private String vendorId;
    private List<VendorOrderLineItem> items;
    private double total;
    private Date dateOrdered;
}
