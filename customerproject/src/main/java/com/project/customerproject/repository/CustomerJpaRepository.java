package com.project.customerproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.customerproject.entity.Customer;

public interface CustomerJpaRepository extends JpaRepository<Customer, Integer>{

}
