package io.spring.start.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.spring.start.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
