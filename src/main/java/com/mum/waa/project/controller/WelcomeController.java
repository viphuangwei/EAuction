package com.mum.waa.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mum.waa.project.service.AuctionService;

@Controller
@RequestMapping("/")
public class WelcomeController {
	
	@Autowired
	AuctionService auctionService;
	
	@RequestMapping("/")
	public String welcomePage(Model model){
		
		model.addAttribute("auctions", auctionService.getAllAuctions());
		return "Welcome";
	}

	@RequestMapping("/test")
	public String testPage(){
		return "Test";
	}
	
}