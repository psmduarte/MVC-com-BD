package com.duarte.basededados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.duarte.basededados.entidade.Funcionarios;
import com.duarte.basededados.repository.FuncionariosRepository;

@Controller
@RequestMapping("/")
public class FuncionariosController {
	
	private FuncionariosRepository funcionariosRepository;
	
	@Autowired
	public FuncionariosController (FuncionariosRepository funcionariosRepository) {
		this.funcionariosRepository = funcionariosRepository;
	}
	
	@RequestMapping(value = "/{nome}", method = RequestMethod.GET)
	public String listaFuncionarios(@PathVariable("nome") String nome, Model model) {
		List<Funcionarios> listaFuncionarios = funcionariosRepository.findByNome(nome);
		if(listaFuncionarios !=null) {
			model.addAttribute("funcionarios", listaFuncionarios);
		}
		return "listaFuncionarios";
	}
	@RequestMapping(value = "/{nome}", method = RequestMethod.POST)
	public String adicionaFuncionario(@PathVariable("nome") String nome, Funcionarios funcionario) {
		funcionario.setNome(nome);
		funcionariosRepository.save(funcionario);
		return "redirect:/{nome}";
	}
	
	
	
	
	
	
	

}
