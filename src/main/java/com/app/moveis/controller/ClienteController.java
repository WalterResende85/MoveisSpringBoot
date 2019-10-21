package com.app.moveis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	@DeleteMapping("/delete/{id}")
	public void deletaCliente(@PathVariable(value="id") long id) {
		Cliente cliente = cr.findById(id);
		cr.delete(cliente);
	}
	
	@GetMapping("/{acao}/{id}")
	public ModelAndView deletaCliente(@PathVariable(value="acao")String acao, @PathVariable(value="id") long id) {
		Cliente cliente = cr.findById(id);
		ModelAndView mv = new ModelAndView("cadastroCliente");
		mv.addObject("cliente", cliente);
		mv.addObject("acao", acao);
				
		return mv;
	}
	
	

	
}
