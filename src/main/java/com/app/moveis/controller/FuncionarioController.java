package com.app.moveis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.moveis.model.Funcionario;
import com.app.moveis.repository.FuncionarioRepository;

@Controller
public class FuncionarioController {
	@Autowired
	FuncionarioRepository fr;
	
	@RequestMapping("/cadastroFuncionario")
	public String cadastroFuncionario() {
		return "/cadastroFuncionario";
	}
	@RequestMapping(value="/cadastroFuncionario", method = RequestMethod.POST)
	public void cadastrarFuncionario(Funcionario funcionario) {
		fr.save(funcionario);
	}
}
