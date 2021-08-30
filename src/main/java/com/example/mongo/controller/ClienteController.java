package com.example.mongo.controller;


import com.example.mongo.entity.Cliente;
import com.example.mongo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/usuario")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    public Cliente cadastrarCliente(@RequestBody Cliente cliente){
        return clienteService.cadastrarCliente(cliente);
    }


    @GetMapping()
    public List<Cliente> findAllCliente() {
        return clienteService.listAllCliente();
    }


}
