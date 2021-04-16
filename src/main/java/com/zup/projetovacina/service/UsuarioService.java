package com.zup.projetovacina.service;

import com.zup.projetovacina.repository.UsuarioRepository;
import com.zup.projetovacina.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UsuarioService {

    @Autowired //injeta UsuarioRepository (classe-interface)
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsuario ( Usuario usuario ) {
        validarCadastro(usuario);
        return usuarioRepository.save(usuario);
    }

    public void validarCadastro ( Usuario usuario ) {
        if (encontrarPorEmail(usuario.getEmail()) != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Email já existe");
        }
        if (encontrarPorCpf(usuario.getCpf()) != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CPF já existe");
        }
    }

    public Usuario encontrarPorEmail ( String email ) {
        return usuarioRepository.findByEmail(email);
    }

    public Usuario encontrarPorCpf ( String cpf ) {
        return usuarioRepository.findByCpf(cpf);
    }
}
