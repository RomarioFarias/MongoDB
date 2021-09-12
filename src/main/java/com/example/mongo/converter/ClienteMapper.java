package com.example.mongo.converter;

import com.example.mongo.dto.ClienteDto;
import com.example.mongo.entity.Cliente;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ClienteMapper {
    private final ModelMapper mapCliente;

    public Cliente toCliente(ClienteDto clienteDto) {
        return this.mapCliente.map(clienteDto, Cliente.class);
    }

    public ClienteDto toClienteDto(Cliente cliente) {
        return this.mapCliente.map(cliente, ClienteDto.class);
    }

    public List<Cliente> toClientes(List<ClienteDto> listClienteDto) {
        return listClienteDto.stream().map(this::toCliente).collect(Collectors.toList());
    }

    public List<ClienteDto> toClientesDto(List<Cliente> listCliente) {
        return listCliente.stream().map(this::toClienteDto).collect(Collectors.toList());
    }

    public List<ClienteDto> toClientesDto(Page<Cliente> pageCliente) {
        return pageCliente.stream().map(this::toClienteDto).collect(Collectors.toList());
    }
}
