package com.zup.projetovacina.usuario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Vacinacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String nomevac;
    private LocalDate dataVac;

    public Vacinacao () {
    }

    public Vacinacao ( Long id, String email, String nomevac, LocalDate dataVac ) {
        this.id = id;
        this.email = email;
        this.nomevac = nomevac;
        this.dataVac = dataVac;
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
