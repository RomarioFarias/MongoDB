package com.example.mongo.service;

import com.example.mongo.entity.Cliente;
import com.example.mongo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;


    public List<Cliente> listarTodosClientes() {
        return clienteRepository.findAll();
    }

    public Page<Cliente> listarClientesFiltro(String filtro, Pageable pageable) {
        return this.devolveListaPaginadas(filtro, pageable);
    }

    private Page<Cliente> devolveListaPaginadas(String filtro, Pageable pageable) {
        if (filtro != null && !filtro.isEmpty()) {
            return clienteRepository.findByNome(filtro, pageable);
        }
        return clienteRepository.findAll(pageable);
    }

    @Transactional
    public Cliente atualizarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente cadastrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Transactional
    public void deletarCliente(Long id) {
        this.clienteRepository.deleteById(id);
    }
}
