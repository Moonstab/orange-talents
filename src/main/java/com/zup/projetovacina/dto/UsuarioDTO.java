package com.zup.projetovacina.dto;

import com.zup.projetovacina.usuario.Usuario;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import java.time.LocalDate;

public class UsuarioDTO {

    @CPF
    @Column(unique = true)
    private String cpf;
    private String nome;
    private LocalDate datanasc;

    @Email
    @Column(unique = true)
    private String email;
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
    //static != exclusivo(não utiliza this.)

    public static Usuario converterDtoParaUsuario ( UsuarioDTO usuarioDTO ) {
        Usuario usuarioNovo = new Usuario();

        usuarioNovo.setNome(usuarioDTO.getNome());
        usuarioNovo.setCpf(usuarioDTO.getCpf());
        usuarioNovo.setEmail(usuarioDTO.getEmail());
        usuarioNovo.setDatanasc(usuarioDTO.getDatanasc());
        return usuarioNovo;
        //usuarioNovo será persistido
    }
}
