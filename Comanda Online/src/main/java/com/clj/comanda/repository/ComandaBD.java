package com.clj.comanda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clj.comanda.model.Comidas;

public interface ComandaBD extends JpaRepository<Comidas, Long> {

}
