package com.scb.rutherford.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.scb.rutherford.project.dao.ICustomerDAO;
import com.scb.rutherford.project.model.Customer;
import com.scb.rutherford.project.service.ICustomerService;

@RestController
@CrossOrigin
public class CustomerController {
	@Autowired
	private ICustomerService iCustomerService;

	// particular Annotation
	@GetMapping("/hello")
	public String welcome() {
		return "Welcome to Spring Boot";
	}

	// Generic Annotation (get,put, post,delete)
	@RequestMapping("/project")
	public String welcome1() {
		return "Welcome to My Project";
	}

	@RequestMapping(value = "/project1", method = RequestMethod.GET)
	public String welcome2() {
		return "Welcome to My Project output using request mapping";
	}

	@Autowired
	private Customer customer;

	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return iCustomerService.getCustomerById(id);
	}

	@GetMapping("/customer")
	public List<Customer> getCustomers() {
		return iCustomerService.getCustomers();
	}

	@PutMapping("/customer/{id}")
	public int editCustomer(@PathVariable int id, @RequestBody Customer updatedCustomer) {
		return iCustomerService.editCustomer(id, updatedCustomer);
	}

	@PostMapping("/customer")
	public int addCustomer(@RequestBody Customer customer) {
		return iCustomerService.addCustomer(customer);
	}

	@DeleteMapping("/customer/{id}")
	public int deleteCustomer(@PathVariable int id) {
		return iCustomerService.deleteCustomer(id);
	}
}
