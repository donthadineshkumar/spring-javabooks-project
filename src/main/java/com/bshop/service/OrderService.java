package com.bshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bshop.entity.Customer;
import com.bshop.entity.CustomerOrder;
import com.bshop.repository.OrderRepository;


@Service
public class OrderService {

	
	@Autowired
	OrderRepository orderRepository;

	public void saveOrder(CustomerOrder order){
			orderRepository.save(order);
	}

	
}
