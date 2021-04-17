package com.zup.projetovacina.controller;

import com.zup.projetovacina.dto.UsuarioDTO;
import com.zup.projetovacina.service.UsuarioService;
import com.zup.projetovacina.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> cadastroUsuario ( @Valid @RequestBody UsuarioDTO usuarioDTO ) {
        Usuario usuario = UsuarioDTO.converterDtoParaUsuario(usuarioDTO);
        usuario = usuarioService.cadastrarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }
   }
