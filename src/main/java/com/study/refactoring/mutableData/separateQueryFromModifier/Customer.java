package com.study.refactoring.mutableData.separateQueryFromModifier;

import java.util.List;

public class Customer {

    private String name;

    private List<Invoice> invoices;

    public Customer(String name, List<Invoice> invoices) {
        this.name = name;
        this.invoices = invoices;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public String getName() {
        return name;
    }
}
