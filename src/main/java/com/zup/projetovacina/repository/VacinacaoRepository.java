package com.zup.projetovacina.repository;

import com.zup.projetovacina.usuario.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinacaoRepository extends JpaRepository<Vacina, Long> {

}
