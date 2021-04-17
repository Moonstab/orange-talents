package com.zup.projetovacina.usuario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Vacinacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String email;
    @NotBlank
    private String nome;
    @NotNull
    private LocalDate dataVacinacao;

    public Vacinacao () {
    }


    public Long getId () {
        return id;
    }

    public void setId ( Long id ) {
        this.id = id;
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

    public void setNome ( String nomevac ) {
        this.nome = nomevac;
    }

    public LocalDate getDataVacinacao () {
        return dataVacinacao;
    }

    public void setDataVacinacao ( LocalDate dataVacinacao ) {
        this.dataVacinacao = dataVacinacao;
    }
}
