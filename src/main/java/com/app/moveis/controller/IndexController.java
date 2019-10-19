package com.app.moveis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/listaCliente")
	public String listaCliente() {
		return "listaCliente";
	}
	
}
