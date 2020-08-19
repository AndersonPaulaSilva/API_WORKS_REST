package com.anderson.apirest.repository;

import com.anderson.apirest.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNome (String nome);
    List<Cliente> findByNomeConteining (String nome);

    Cliente findByEmail (String email);
}
