package com.zup.projetovacina.dto;

import com.zup.projetovacina.usuario.Vacinacao;

import java.time.LocalDate;

public class VacinacaoDTO {

    private String email;
    private String nomevac;
    private LocalDate dataVac;

    public VacinacaoDTO () {
    }

    public String getEmail () {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public String getNomevac () {
        return nomevac;
    }

    public void setNomevac ( String nomevac ) {
        this.nomevac = nomevac;
    }

    public LocalDate getDataVac () {
        return dataVac;
    }

    public void setDataVac ( LocalDate dataVac ) {
        this.dataVac = dataVac;
    }

    public static Vacinacao converterDtoParaVacinacao ( VacinacaoDTO vacinacaoDTO ) {
        Vacinacao vacinacao = new Vacinacao();
        vacinacao.setDataVac(vacinacaoDTO.getDataVac());
        vacinacao.setEmail(vacinacaoDTO.getEmail());
        vacinacao.setNomevac(vacinacaoDTO.getNomevac());

        return vacinacao;
    }
}
