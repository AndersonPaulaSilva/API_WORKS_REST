package com.anderson.apirest.controller;

import com.anderson.apirest.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {

        var cliente1 = new Cliente();

        cliente1.setId(1L);
        cliente1.setNome("Anderson");
        cliente1.setTelefone("34 99999-1111");
        cliente1.setEmail("andersonnetmail@gmail.com");

        var cliente2 = new Cliente();

        cliente2.setId(1L);
        cliente2.setNome("Silva");
        cliente2.setTelefone("21 99999-2222");
        cliente2.setEmail("andersonpauladasilva@gmail.com");

        var cliente3 = new Cliente();

        cliente3.setId(1L);
        cliente3.setNome("Paula");
        cliente3.setTelefone("21 88888-3333");
        cliente3.setEmail("andersonpauladasilva@gmail.com");

        return Arrays.asList(cliente1, cliente2, cliente3);
    }
}
