package com.bshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bshop.entity.Customer;
import com.bshop.exception.CustomerNotFoundException;
import com.bshop.repository.CustomerRepository;


@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException{
		Customer cust= customerRepository.findByPhoneNumber(phoneNumber);
		if(cust == null){
			throw new CustomerNotFoundException();
		}
		else{
			return cust;
		}
	}
	
	public void addCustomer(Customer customer){
		customerRepository.save(customer);
	}
	
}
