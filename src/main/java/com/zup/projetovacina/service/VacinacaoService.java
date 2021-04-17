package com.zup.projetovacina.service;

import com.zup.projetovacina.repository.UsuarioRepository;
import com.zup.projetovacina.repository.VacinacaoRepository;
import com.zup.projetovacina.usuario.Usuario;
import com.zup.projetovacina.usuario.Vacinacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class VacinacaoService {
    @Autowired
    private VacinacaoRepository vacinacaoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Vacinacao cadastrarVacinacao ( Vacinacao vacina ) {

        String email = vacina.getEmail();
        Boolean emailExistente = checarExistenciaDeEmail(email);
        if (emailExistente == true) {
            return vacinacaoRepository.save(vacina);
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "E-mail não está cadastrado.");
        }
    }

    public Boolean checarExistenciaDeEmail ( String email ) {
        Usuario usuario = usuarioRepository.findByEmail(email);
        if (usuario != null) {
            return true;
        } else {
            return false;
        }
    }
}