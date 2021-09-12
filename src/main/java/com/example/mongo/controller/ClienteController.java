package com.example.mongo.controller;


import com.example.mongo.converter.ClienteMapper;
import com.example.mongo.dto.ClienteDto;
import com.example.mongo.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Controller
@RequestMapping("/v1/api/cliente")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    private final ClienteMapper clienteMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDto cadastrarCliente(@RequestBody @Valid ClienteDto clienteDto) {
        var cliente = clienteService.cadastrarCliente(clienteMapper.toCliente(clienteDto));
        return this.clienteMapper.toClienteDto(cliente);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<ClienteDto> listarTodosClientes() {
        var listCliente = clienteService.listarTodosClientes();
        return this.clienteMapper.toClientesDto(listCliente);
    }

    @GetMapping("/listarCliente/paginacao/")
    @ResponseStatus(HttpStatus.OK)
    public List<ClienteDto> listarClientesFiltro(@RequestParam(defaultValue = "") String filtro, @PageableDefault(page = 1, size = 2, direction = Sort.Direction.ASC) Pageable pageable) {
        var pageCliente = clienteService.listarClientesFiltro(filtro, pageable);
        return this.clienteMapper.toClientesDto(pageCliente);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ClienteDto atualizarCliente(@RequestBody @Valid ClienteDto clienteDto) {
        var cliente = this.clienteService.atualizarCliente(this.clienteMapper.toCliente(clienteDto));
        return this.clienteMapper.toClienteDto(cliente);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarCliente(@PathVariable Long id) {
        this.clienteService.deletarCliente(id);
    }
}
