package br.edu.infnet.locadorademotos.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import br.edu.infnet.locadorademotos.model.domain.Custom;
import br.edu.infnet.locadorademotos.model.domain.Usuario;
import br.edu.infnet.locadorademotos.model.repository.CustomRepository;

@Service
public class CustomService {

	@Autowired
	private CustomRepository customRepository;

	public Custom incluir(Custom custom) {
		return customRepository.save(custom);
	}
	public void excluir(Integer id) {
		customRepository.deleteById(id);
	}
	public Collection<Custom> obterLista(){
		return (Collection<Custom>) customRepository.findAll();
	}
	public Collection<Custom> obterLista(Usuario usuario){
		return (Collection<Custom>) customRepository.obterLista(usuario.getId());
	}
	public Custom obterPorId(Integer id) {
		return customRepository.findById(id).orElse(null);
	}
	public Collection<Custom> obterListaOrdenadaPorAno(){
		return (Collection<Custom>) customRepository.findAll(Sort.by(Sort.Direction.ASC, "ano"));
	}
	public Collection<Custom> obterListaOrdenadaPorAno(Usuario usuario){
		return (Collection<Custom>) customRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC, "ano"));
	}
}