package com.horasan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horasan.model.Customer;
import com.horasan.repos.CustomerRepo;

@RestController
@RequestMapping("/customerapi")
public class CustomerController {
	
	@Autowired
	private CustomerRepo customerRepo;

	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerRepo.save(customer);
	}
	
	@GetMapping("/customer")
	public List<Customer> getAllCustomers(@RequestBody Customer customer) {
		return customerRepo.findAll();
	}
}
