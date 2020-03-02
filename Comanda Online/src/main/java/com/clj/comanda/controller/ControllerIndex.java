package com.clj.comanda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.clj.comanda.repository.ComandaBD;

@Controller
public class ControllerIndex {
	@Autowired
	ComandaBD comida;

	@GetMapping("/")
    public String Home(Model model) {

		
   	 return "home";
    }
	
}
