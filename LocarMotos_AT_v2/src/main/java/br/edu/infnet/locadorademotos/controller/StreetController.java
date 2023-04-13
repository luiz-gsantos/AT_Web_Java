package br.edu.infnet.locadorademotos.controller;


import br.edu.infnet.locadorademotos.model.domain.Street;
import br.edu.infnet.locadorademotos.model.domain.Usuario;
import br.edu.infnet.locadorademotos.model.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class StreetController {

	@Autowired
	private StreetService streetService;
	private String msg;
	@GetMapping(value = "/street")
	public String telaCadastro() {
		return "produtos/cadastro/street";
	}
	@GetMapping(value = "listastreet")
	public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {
		model.addAttribute("streets", streetService.obterListaOrdenadaPorAno());
		model.addAttribute("mensagem", msg);
		msg = null;
		return "produtos/lista/listastreet";
	}
	@PostMapping(value = "/street/incluir")
	public String incluir(Street street, @SessionAttribute("usuario") Usuario usuario) {
		street.setUsuario(usuario);
		streetService.incluir(street);
		msg = "A moto do tipo Street foi adicionada com sucesso!";
		return "redirect:/listastreet";
	}
	@GetMapping(value = "/street/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		Street street = streetService.obterPorId(id);
		streetService.excluir(id);
		msg = "A moto do tipo Street foi excluida com sucesso!";
		return "redirect:/listastreet";
	}
}