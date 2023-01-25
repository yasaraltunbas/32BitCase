package com.project.customerproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity


public class Customer {

	@Id
	private int customerId;
	private String customerName;
	private String customerSurname;
	private int customerAge;
	public Customer(int customerId, String customerName, String customerSurname, int customerAge) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerSurname = customerSurname;
		this.customerAge = customerAge;
	}
	public Customer() {
		super();
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerSurname() {
		return customerSurname;
	}
	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	
}
