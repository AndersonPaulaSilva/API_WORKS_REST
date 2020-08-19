package com.anderson.apirest.service;

import com.anderson.apirest.exception.NegocioException;
import com.anderson.apirest.model.Cliente;
import com.anderson.apirest.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CadastroClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente){
        Cliente clienteExistente = clienteRepository.findByEmail(cliente.getEmail());

        if (clienteExistente != null && !clienteExistente.equals(cliente)){
            throw new NegocioException("Já há cliente cadastrado com este email.");
        }

        return clienteRepository.save(cliente);
    }

    public void excluir(Long clienteId){
        clienteRepository.deleteById(clienteId);
    }
}
