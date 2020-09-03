package com.scb.rutherford.project.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.scb.rutherford.project.dao.ICustomerDAO;
import com.scb.rutherford.project.model.Customer;

@Repository
public class CustomerDAOImpl implements ICustomerDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub

		String query = "select id,first_name,last_name,email,phone,active from customers where id=?";
		RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<Customer>(Customer.class);
		Customer customer = jdbcTemplate.queryForObject(query, rowMapper, id);
		return customer;
	}

	@Override
	public List<Customer> getCustomers() {
		String query = "select id,first_name,last_name,email,phone,active from customers";
		RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<Customer>(Customer.class);
		List<Customer> customersList = jdbcTemplate.query(query, rowMapper);
		return customersList;
	}

	@Override
	public int addCustomer(Customer customer) {

		int insertStatus = -1;
		String query = "INSERT INTO customers(first_name, last_name, email, phone, active) VALUES ( ?, ?, ?, ?, ?)";
		insertStatus = jdbcTemplate.update(query, customer.getFirstName(), customer.getLastName(), customer.getEmail(),
				customer.getPhone(), customer.getActive());
		return insertStatus;
	}

	@Override
	public int deleteCustomer(int id) {

		int deleteStatus = -1;
		String query = "DELETE FROM customers WHERE id=?";
		deleteStatus = jdbcTemplate.update(query, id);
		return deleteStatus;
	}

	@Override
	public int editCustomer(int id, Customer updatedCustomer) {
		// TODO Auto-generated method stub
		int editStatus = -1;
		String query = "UPDATE public.customers SET first_name=?, last_name=?, email=?, phone=?, active=? WHERE id=?";
		editStatus = jdbcTemplate.update(query, updatedCustomer.getFirstName(), updatedCustomer.getLastName(),
				updatedCustomer.getEmail(), updatedCustomer.getPhone(), updatedCustomer.getActive(), id);
		return editStatus;
	}

}
