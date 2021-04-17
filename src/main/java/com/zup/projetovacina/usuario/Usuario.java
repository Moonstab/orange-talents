package com.zup.projetovacina.usuario;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Email
    @NotBlank
    @Column(unique = true)
    private String email;
    @CPF
    @Column(unique = true)
    private String cpf;
    private String nome;
    private LocalDate datanasc;

    public Usuario () {
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

    public String getCpf () {
        return cpf;
    }

    public void setCpf ( String cpf ) {
        this.cpf = cpf;
    }

    public String getNome () {
        return nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public LocalDate getDatanasc () {
        return datanasc;
    }

    public void setDatanasc ( LocalDate datanasc ) {
        this.datanasc = datanasc;
    }
}
