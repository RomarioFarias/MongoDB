package com.example.mongo.service;

import com.example.mongo.entity.Cliente;
import com.example.mongo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;


    public List<Cliente> listAllCliente() {
        return clienteRepository.findAll();
    }

    public Page<Cliente> listarClientesFiltro(String filtro, Pageable pageable) {
        return this.devolveListaPaginadas(filtro, pageable);
    }

    public Page<Cliente> devolveListaPaginadas(String filtro, Pageable pageable) {
        if (filtro != null && !filtro.isEmpty()) {
            return clienteRepository.findByNome(filtro, pageable);
        }
        return clienteRepository.findAll(pageable);
    }

    public Cliente atualizarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente cadastrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
