package com.bshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bshop.entity.Customer;



@Controller("order")
public class OrderController {

	@RequestMapping(method=RequestMethod.GET)
	public String callFlow(Model model){
		model.addAttribute("customer",new Customer());
		return "checkCust";
	}
}
