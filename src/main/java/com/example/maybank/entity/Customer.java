package com.example.maybank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    
    @Column(name = "ACCOUNT_NUMBER")
    private Long accountNumber;

    public Customer(Long customerId, Long accountNumber) {
        this.customerId = customerId;
        this.accountNumber = accountNumber;
    }

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
