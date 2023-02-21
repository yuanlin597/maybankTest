package com.example.maybank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

//    @Id
//    @Column(name = "ID")
//    private Long id;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Id
    @Column(name = "ACCOUNT_NUMBER")
    private Long accountNumber;

    public Customer() {
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
