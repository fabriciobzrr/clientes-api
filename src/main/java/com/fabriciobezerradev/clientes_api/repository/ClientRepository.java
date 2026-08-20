package com.fabriciobezerradev.clientes_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabriciobezerradev.clientes_api.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
