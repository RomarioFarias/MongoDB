package com.example.mongo.repository;

import com.example.mongo.entity.Cliente;
import com.example.mongo.entity.Criteiros;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, Long> {

    Page<Cliente> findByNome(String nome, Pageable pageable);

}
