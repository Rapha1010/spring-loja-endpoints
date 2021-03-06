package com.raphaelalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raphaelalves.cursomc.domain.Cidade;
import com.raphaelalves.cursomc.domain.Produto;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
