package com.zup.projetovacina.controller;

import com.zup.projetovacina.repository.VacinacaoRepository;
import com.zup.projetovacina.service.VacinaService;
import com.zup.projetovacina.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/vacinausuario")
public class VacinacaoController {
    @Autowired
    VacinaService vacinacaService;


}
