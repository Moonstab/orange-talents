package com.zup.projetovacina.controller;

import com.zup.projetovacina.dto.UsuarioDTO;
import com.zup.projetovacina.service.UsuarioService;
import com.zup.projetovacina.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/respostausuario")
public class UsuarioController {

    @Autowired /*injeta a classe UsuarioService*/
            UsuarioService usuarioService;

    @GetMapping
    public String verificarFuncionamento () {
        System.out.println("Estou rodando");
        return "Cliente";
    }

    @PostMapping
    public String cadastroUsuario ( @RequestBody UsuarioDTO usuarioDTO ) {
        System.out.println(usuarioDTO.getCpf());
        System.out.println(usuarioDTO.getEmail());
        System.out.println(usuarioDTO.getDatanasc());
        System.out.println(usuarioDTO.getNome());

        Usuario usuario = UsuarioDTO.converterDtoParaUsuario(usuarioDTO);
        return "ok";
    }
}
