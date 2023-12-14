package com.deva.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.deva.entities.Category;
import com.deva.entities.Food;
import com.deva.repo.FoodRepo;

@Controller
public class MyController {
	
	@Autowired
	private FoodRepo frepo;
	
	@GetMapping({"/","home"})
	public String home(Model mod) {
		
		List<Food> lsMain = frepo.findByCid(new Category(1));
		List<Food> lsDesserts = frepo.findByCid(new Category(2));
		List<Food> lsDrinks = frepo.findByCid(new Category(3));
		
//		System.err.println(lsMain.size());
//		System.err.println(lsDesserts.size());
//		System.err.println(lsDrinks.size());
		
		mod.addAttribute("lsMain",lsMain);
		mod.addAttribute("lsDesserts",lsDesserts);
		mod.addAttribute("lsDrinks",lsDrinks);
		
		
		return "index";
	}
}
