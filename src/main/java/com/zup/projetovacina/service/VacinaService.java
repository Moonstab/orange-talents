package com.zup.projetovacina.service;

import com.zup.projetovacina.repository.VacinacaoRepository;
import com.zup.projetovacina.usuario.Usuario;
import com.zup.projetovacina.usuario.Vacinacao;
import org.springframework.beans.factory.annotation.Autowired;

public class VacinaService {
    @Autowired
    private VacinacaoRepository vacinacaoRepository;

    public Usuario cadastrarVacinacao ( Vacinacao vacinacao
    ) {
        return VacinacaoRepository.save(vacinacao);
}
