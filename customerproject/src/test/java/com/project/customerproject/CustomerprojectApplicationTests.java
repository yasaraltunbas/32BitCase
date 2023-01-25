package com.project.customerproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.customerproject.entity.Customer;
import com.project.customerproject.repository.CustomerJpaRepository;
import com.project.customerproject.service.CustomerService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class CustomerprojectApplicationTests {

	
		@InjectMocks
		private CustomerService customerService;
		
		@Mock
		private CustomerJpaRepository customerJpaRepository;
		@Test
		public void testSave() {
		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setCustomerName("Test-Name");
		customer.setCustomerSurname("Test-Surname");
		customer.setCustomerAge(22);
		
		
		
	
		Customer result = customerJpaRepository.save(customer);
		
		assertEquals(result.getCustomerName(), customer.getCustomerName());

		}
		
	

}
