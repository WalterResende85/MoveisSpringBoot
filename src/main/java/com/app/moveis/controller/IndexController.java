package com.app.moveis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.moveis.model.Cliente;
import com.app.moveis.model.Fornecedor;
import com.app.moveis.model.Funcionario;
import com.app.moveis.repository.ClienteRepository;
import com.app.moveis.repository.FornecedorRepository;
import com.app.moveis.repository.FuncionarioRepository;

@Controller
public class IndexController {
	@Autowired
	private ClienteRepository cr;
	@Autowired
	private FuncionarioRepository fr;
	@Autowired
	private FornecedorRepository fornr;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/listaCliente")
	public String listaCliente() {
		return "listaCliente";
	}
	@GetMapping("/listaCliente")
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
	@GetMapping("/listaFuncionario")
	public ModelAndView listaFuncionarios() {
		ModelAndView mv = new ModelAndView("listaFuncionario");
		Iterable<Funcionario> funcionarios = fr.findAll();
		mv.addObject("funcionarios", funcionarios);
		return mv;
	}
	
	
	@RequestMapping("/listaFornecedor")
	public String listaFornecedor() {
		return "listaFornecedor";
	}
	
	@GetMapping("/listaFornecedor")
	public ModelAndView listaFornecedoress() {
		ModelAndView mv = new ModelAndView("listaFornecedor");
		Iterable<Fornecedor> fornecedores = fornr.findAll();
		mv.addObject("fornecedores", fornecedores);
		return mv;
	}
	
}
