package br.edu.infnet.locadorademotos.controller;


import br.edu.infnet.locadorademotos.model.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViaCepController {

	@Autowired
	private ViaCepService viaCepService;
	
	@PostMapping(value = "/cep")
	public String buscaCep(Model model, @RequestParam String cep) {
		model.addAttribute("endereco", viaCepService.buscaPorCep(cep));
		return "usuario/cadastro";
	}

}
