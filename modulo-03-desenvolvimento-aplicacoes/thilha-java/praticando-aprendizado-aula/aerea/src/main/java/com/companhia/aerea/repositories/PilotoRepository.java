package com.companhia.aerea.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.companhia.aerea.entities.Piloto;

@Repository
public interface PilotoRepository extends JpaRepository<Piloto, Long> {

    List<Piloto> findByNomeContainingIgnoreCase(String nome);

    List<Piloto> findAllByOrderByNome();
}