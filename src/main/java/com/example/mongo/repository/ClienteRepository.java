package com.example.mongo.repository;

import com.example.mongo.entity.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, Long> {

    @Query("{'nome':?0}")
    List<Cliente> findClienteByNome (String nome);



}
