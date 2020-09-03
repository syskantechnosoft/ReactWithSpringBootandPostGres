package com.scb.rutherford.project.dao;

import java.util.List;

import com.scb.rutherford.project.model.Customer;


public interface ICustomerDAO {

	public Customer getCustomerById(int id);

	public List<Customer> getCustomers();

	public int addCustomer(Customer customer);

	public int deleteCustomer(int id);

	public int editCustomer(int id, Customer updatedCustomer);
}
