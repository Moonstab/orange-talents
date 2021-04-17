package com.zup.projetovacina.dto;

import com.zup.projetovacina.usuario.Vacinacao;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class VacinacaoDTO {
    @NotBlank
    private String email;
    @NotBlank
    private String nome;
    @NotNull
    private LocalDate data;

    public VacinacaoDTO () {
    }

    public static Vacinacao converterDtoParaVacinacao ( VacinacaoDTO vacinacaoDTO ) {
        Vacinacao vacina = new Vacinacao();
        vacina.setDataVacinacao(vacinacaoDTO.getData());
        vacina.setEmail(vacinacaoDTO.getEmail());
        vacina.setNome(vacinacaoDTO.getNome());

        return vacina;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public String getNome () {
        return nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public LocalDate getData () {
        return data;
    }

    public void setData ( LocalDate data ) {
        this.data = data;
    }
}
