package com.tcc.api.tcc.repositorios;

import com.tcc.api.tcc.entidades.Mercancia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MercanciaRepositorio extends JpaRepository<Mercancia,Integer> {




}
