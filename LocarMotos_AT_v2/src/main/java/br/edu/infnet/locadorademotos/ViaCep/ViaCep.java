package br.edu.infnet.locadorademotos.ViaCep;

import br.edu.infnet.locadorademotos.model.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoViaCep")
public interface ViaCep {

	@GetMapping(value = "/{cep}/json")
	public Endereco buscaPorCep(@PathVariable String cep);
}