package com.zup.projetovacina.usuario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String cpf;
    private String nome;
    private LocalDate datanasc;


    public Usuario ( Long id, String email, String cpf, String nome, LocalDate datanasc ) {
        this.id = id;
        this.email = email;
        this.cpf = cpf;
        this.nome = nome;
        this.datanasc = datanasc;
    }

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
