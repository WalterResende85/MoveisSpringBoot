package com.app.moveis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.moveis.model.Fornecedor;
import com.app.moveis.repository.FornecedorRepository;

@Controller
public class FornecedorController {
	@Autowired
	FornecedorRepository fr;

	@RequestMapping("/cadastroFornecedor")
	public String cadastroFornecedor() {
		return "/cadastroFornecedor";
	}

	@RequestMapping(value="/cadastroFornecedor", method = RequestMethod.POST)
	public void cadastrarFornecedor(Fornecedor fornecedor) {
	fr.save(fornecedor);
}
}
