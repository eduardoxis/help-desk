package com.dudu.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dudu.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
