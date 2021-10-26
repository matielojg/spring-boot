package io.spring.start.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.spring.start.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
