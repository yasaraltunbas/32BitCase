package com.project.customerproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.customerproject.entity.Customer;
import com.project.customerproject.repository.CustomerJpaRepository;
import com.project.customerproject.result.DataResult;
import com.project.customerproject.result.ErrorDataResult;
import com.project.customerproject.result.ErrorResult;
import com.project.customerproject.result.Result;
import com.project.customerproject.result.SuccessDataResult;
import com.project.customerproject.result.SuccessResult;



@Service
public class CustomerService {

	public CustomerJpaRepository customerJpaRepository;

	public CustomerService(CustomerJpaRepository customerJpaRepository) {
		super();
		this.customerJpaRepository = customerJpaRepository;
	}

	public DataResult<Optional<Customer>>  getCustomerById(int id) {
		Optional<Customer> customerId = customerJpaRepository.findById(id);

		if(customerId.isPresent())
		{
		return new SuccessDataResult<Optional<Customer>>(this.customerJpaRepository.findById(id), "Müsteriler Listelendi");
		}
		else 
			return new ErrorDataResult<Optional<Customer>>("Girdiğiniz id'ye ait müsteri bulunamadı.");
	}

	public DataResult<List<Customer>> getAllCustomer() {
	    
		return new SuccessDataResult<List<Customer>>
		(this.customerJpaRepository.findAll(),"Tüm Müsteriler Listelendi");			
			
}

	public Result addCustomer( Customer customer) {
		this.customerJpaRepository.save(customer);
		return new SuccessResult("Müsteri Eklendi.");
	}

	public Result deleteCustomerById( int id) {

        Optional<Customer> product = customerJpaRepository.findById(id);
        if(product.isPresent()) {

            customerJpaRepository.deleteById(id);
        }
        boolean isDeleted = !customerJpaRepository.existsById(id);

        if (isDeleted){
            return new SuccessResult(""+ id + " id'li müşteri silindi.");
        }

        return new ErrorResult(""+ id + " id'li müşteri silinirken hata oluştu.");
    }

	public DataResult<List<Customer>> getAllByPage(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		
		return new SuccessDataResult<List<Customer>>
		(this.customerJpaRepository.findAll(pageable).getContent(), "Başarılı");
	}

	public DataResult<List<Customer>> getAllSortedDesc() {
		Sort sort = Sort.by(Sort.Direction.DESC,"customerName");
		return new SuccessDataResult<List<Customer>>
		(this.customerJpaRepository.findAll(sort),"Başarılı");
	}

	public DataResult<List<Customer>> getAllSortedAsc() {
		Sort sort = Sort.by(Sort.Direction.ASC,"customerName");
		return new SuccessDataResult<List<Customer>>
		(this.customerJpaRepository.findAll(sort),"Başarılı");	}

	
}
