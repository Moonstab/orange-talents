package com.zup.projetovacina.service;

import com.zup.projetovacina.repository.VacinacaoRepository;
import com.zup.projetovacina.usuario.Vacinacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacinaService {
    @Autowired                                      //VacinaRepository sendo estanciado pelo Springboot
    private VacinacaoRepository vacinacaoRepository;

    public Vacinacao cadastrarVacinacao( Vacinacao vacina ) {
        return vacinacaoRepository.save(vacina);
    }
}