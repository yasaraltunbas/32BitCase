package com.project.customerproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.customerproject.entity.Customer;
import com.project.customerproject.result.DataResult;
import com.project.customerproject.result.Result;
import com.project.customerproject.service.CustomerService;



@RestController
public class CustomerController {

	public CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping("/getCustomerById")
	
	public DataResult< Optional<Customer>> getCustomerById (int id) {
		
		return this.customerService.getCustomerById(id);
	} 

	@GetMapping("/getAllCustomer")
	public DataResult<List<Customer>>  getAllCustomer(){
		return this.customerService.getAllCustomer();
	}
 
	@PostMapping("/addCustomer")
	public Result add(@RequestBody Customer customer) {
		return this.customerService.addCustomer(customer);
	}
	
	
//@DeleteMapping("/{employeeId}")
//	
//	public void deleteCustomerById(@PathVariable int id) {
//		
//		Optional<Customer> customer = customerService.findById(id);
//	
//		}
}

