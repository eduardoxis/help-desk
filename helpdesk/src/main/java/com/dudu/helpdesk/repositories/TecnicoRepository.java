package com.dudu.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dudu.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
