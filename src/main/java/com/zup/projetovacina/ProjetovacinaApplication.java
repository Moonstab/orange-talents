package com.zup.projetovacina;

import com.zup.projetovacina.usuario.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ProjetovacinaApplication {

    public static void main ( String[] args ) {
        Usuario usuario = new Usuario();

        usuario.setCpf("78945612323");
        usuario.setDatanasc(LocalDate.of(1990,12,29));
        usuario.setEmail("zemenino@gmail.com");
        usuario.setNome("José Menino");

        System.out.println(usuario.getEmail());
        System.out.println(usuario.getCpf());
        System.out.println(usuario.getNome());
        System.out.println(usuario.getDatanasc());


        SpringApplication.run(ProjetovacinaApplication.class, args);
    }

}
