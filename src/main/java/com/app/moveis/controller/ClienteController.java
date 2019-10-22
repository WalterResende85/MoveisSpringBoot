package com.app.moveis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.moveis.model.Cliente;
import com.app.moveis.repository.ClienteRepository;

@Controller
public class ClienteController {
	@Autowired
	ClienteRepository cr;
	

	@RequestMapping(value="/cadastroCliente", method = RequestMethod.GET)
	public String cadastroCliente() {
		
		return "/cadastroCliente";
	}
	
	@RequestMapping(value="/cadastroCliente", method = RequestMethod.POST)
	public void cadastrarCliente(Cliente cliente) {
		
		cr.save(cliente);
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public void deletaCliente(@PathVariable(value="id") Long id) {
		Cliente cliente = cr.findById(id);
		cr.delete(cliente);
	}
	
	
	@GetMapping("/{acao}/{id}")
	public ModelAndView preparaCliente(@PathVariable(value="acao")String acao, @PathVariable(value="id") Long id) {
		ModelAndView mv = new ModelAndView("cadastroCliente");
		
		if(id == 0) {
			Cliente cliente = new Cliente();
			System.out.print(cliente.getId());
			mv.addObject(cliente);
			return mv;
		}else {
		Cliente cliente = cr.findById(id);
		
		mv.addObject("cliente", cliente);
		mv.addObject("acao", acao);
		}	
		return mv;
	}
	
	

	
}
