package com.mindsprint.project.dao;

import com.mindsprint.project.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    private List<Customer> list = null;
    public CustomerDaoImpl(){
        list = new ArrayList<>();
        list.add(new Customer(1,"Alex","US"));
        list.add(new Customer(2,"Bob","UK"));
        list.add(new Customer(3,"Catty","IN"));
    }

    @Override
    public Customer addNewCustomer(Customer customer) {
        list.add(customer);
        return customer;
    }

    @Override
    public Customer getCustomer(int id) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return list;
    }

    @Override
    public boolean deleteCustomer(int id) {
        return false;
    }

    @Override
    public boolean updateCustomer(int id, String address) {
        return false;
    }
}
