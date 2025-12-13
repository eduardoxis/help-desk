package com.dudu.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dudu.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
