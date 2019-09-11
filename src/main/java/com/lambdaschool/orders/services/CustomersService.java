package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customers;

import java.util.List;

public interface CustomersService
{
    List<Customers> findAll();

    Customers findAgentById(long custcode);

    Customers findAgentByName(String custname);

    void delete(long custcode);

    Customers save(Customers customers);

    Customers update(Customers customers);
}
