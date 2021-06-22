package com.example.startstart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.startstart.model.Customer;
import com.example.startstart.model.FeatureToggle;
import com.example.startstart.repository.CustomerRepository;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;

	@GetMapping("/customer")
	public List<Customer> getAllCustomer() {
		List<Customer> customers = customerRepository.findAll();
		return customers;
	}
	
	// Used Just to Add MockData
	// @PostMapping(value = "/createCustomers", consumes = "application/json", produces = "application/json")
	// public Customer create(@RequestBody  Customer customers) {
	// 	return customerRepository.save(customers);
	// }
	
}
