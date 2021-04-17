package com.zup.projetovacina.controller;

import com.zup.projetovacina.dto.VacinacaoDTO;
import com.zup.projetovacina.service.VacinacaoService;
import com.zup.projetovacina.usuario.Vacinacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/vacinacao")
public class VacinacaoController {

    @Autowired
    private VacinacaoService vacinacaoService;

    @PostMapping
    public ResponseEntity<Vacinacao> cadastroVacinacao ( @Valid @RequestBody VacinacaoDTO vacinacaoDTO ) {
        Vacinacao vacinacao = VacinacaoDTO.converterDtoParaVacinacao(vacinacaoDTO);
        vacinacao = vacinacaoService.cadastrarVacinacao(vacinacao);
        return ResponseEntity.status(HttpStatus.CREATED).body(vacinacao);
    }
}
