package com.bshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bshop.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	Customer findByPhoneNumber(String phoneNumber);

}
