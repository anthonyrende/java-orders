package com.lambdaschool.orders.controllers;

import com.lambdaschool.orders.models.Customers;
import com.lambdaschool.orders.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomersController
{
    //GET http://localhost:2019/customer/order
    @Autowired
    private CustomersService customersService;
    @GetMapping(value = "/customer/order",
                produces = {"application/json"})
    public ResponseEntity<?> listAllCustomerOrders()
    {
        List<Customers> myCustomers = customersService.findAll();
        return new ResponseEntity<>(myCustomers, HttpStatus.OK);
    }
}
