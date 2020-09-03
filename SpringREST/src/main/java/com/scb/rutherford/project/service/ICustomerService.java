package com.scb.rutherford.project.service;

import java.util.List;

import com.scb.rutherford.project.model.Customer;

public interface ICustomerService {
	public Customer getCustomerById(int id);

	public List<Customer> getCustomers();

	public int addCustomer(Customer customer);

	public int deleteCustomer(int id);

	public int editCustomer(int id, Customer updatedCustomer);
}
