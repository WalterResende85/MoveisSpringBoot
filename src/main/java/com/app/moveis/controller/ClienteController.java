package com.app.moveis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.moveis.model.Cliente;
import com.app.moveis.repository.ClienteRepository;

@Controller
public class ClienteController {
	@Autowired
	ClienteRepository cr;
	
	@RequestMapping("/cadastroCliente")
	public String cadastroCliente() {
		
		return "/cadastroCliente";
	}
	@RequestMapping(value="/cadastroCliente", method = RequestMethod.POST)
	public void cadastrarCliente(Cliente cliente) {
		cr.save(cliente);
	}
	
}
