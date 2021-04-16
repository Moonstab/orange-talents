package com.zup.projetovacina.repository;

import com.zup.projetovacina.usuario.Usuario;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByEmail ( String email );
    Usuario findByCpf( String cpf);

}
