package com.scb.rutherford.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.rutherford.project.dao.ICustomerDAO;
import com.scb.rutherford.project.model.Customer;
import com.scb.rutherford.project.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDAO iCustomerDAO;

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return iCustomerDAO.getCustomerById(id);
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return iCustomerDAO.getCustomers();
	}

	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return iCustomerDAO.addCustomer(customer);
	}

	@Override
	public int deleteCustomer(int id) {
		// TODO Auto-generated method stub
		return iCustomerDAO.deleteCustomer(id);
	}

	@Override
	public int editCustomer(int id, Customer updatedCustomer) {
		// TODO Auto-generated method stub
		return iCustomerDAO.editCustomer(id, updatedCustomer);
	}

}
