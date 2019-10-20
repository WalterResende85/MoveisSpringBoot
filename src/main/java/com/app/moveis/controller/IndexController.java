package com.app.moveis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.moveis.model.Cliente;
import com.app.moveis.repository.ClienteRepository;

@Controller
public class IndexController {
	@Autowired
	ClienteRepository cr;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping(value="/manterCliente", method = RequestMethod.GET)
	public String listaCliente() {
		return "listaCliente";
	}
	@RequestMapping("/manterCliente")
	public ModelAndView listaClientes() {
		ModelAndView mv = new ModelAndView("listaCliente");
		Iterable<Cliente> clientes = cr.findAll();
		mv.addObject("clientes", clientes);
		return mv;
	}
	
	@RequestMapping("/listaFuncionario")
	public String listaFuncionario() {
		return "listaFuncionario";
	}
	@RequestMapping("/listaFornecedor")
	public String listaFornecedor() {
		return "listaFornecedor";
	}
	
}
