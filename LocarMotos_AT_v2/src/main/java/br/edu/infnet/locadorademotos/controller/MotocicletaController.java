package br.edu.infnet.locadorademotos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;
import br.edu.infnet.locadorademotos.model.domain.Motocicleta;
import br.edu.infnet.locadorademotos.model.domain.Usuario;
import br.edu.infnet.locadorademotos.model.service.MotocicletaService;

@Controller
public class MotocicletaController {
	
	@Autowired
	private MotocicletaService motocicletaService;
	private String msg;
	@GetMapping(value = "/listamotocicleta")
	public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {
		model.addAttribute("motocicletas", motocicletaService.obterListaOrdenadaPorAno());
		model.addAttribute("mensagem", msg);
		msg = null;
		return "produtos/lista/listamotocicleta";
	}
	@GetMapping(value = "/motocicleta/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		Motocicleta motocicleta = motocicletaService.obterPorId(id);
		motocicletaService.excluir(id);
		msg = "A motocicleta foi excluida com sucesso!";
		return "redirect:/listamotocicleta";
	}
}