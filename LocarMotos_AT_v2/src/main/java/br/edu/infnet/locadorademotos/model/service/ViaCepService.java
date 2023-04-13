package br.edu.infnet.locadorademotos.model.service;

import br.edu.infnet.locadorademotos.ViaCep.ViaCep;
import br.edu.infnet.locadorademotos.model.domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViaCepService {

    @Autowired
    private ViaCep viaCep;

    public Endereco buscaPorCep(String cep) {
        return viaCep.buscaPorCep(cep);
    }
}