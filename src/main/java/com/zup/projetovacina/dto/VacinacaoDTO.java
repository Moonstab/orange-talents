package com.zup.projetovacina.dto;

import com.zup.projetovacina.usuario.Vacina;

import java.time.LocalDate;

public class VacinacaoDTO {

    private String email;
    private String nomevac;
    private LocalDate dataVac;

    public VacinacaoDTO () {
    }

    public static Vacina converterDtoParaVacinacao ( VacinacaoDTO vacinacaoDTO ) {
        Vacina vacina = new Vacina();
        vacina.setDataVac(vacinacaoDTO.getDataVac());
        vacina.setEmail(vacinacaoDTO.getEmail());
        vacina.setNomevac(vacinacaoDTO.getNomevac());

        return vacina;
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
}
