package com.binary_winters.clientsapp.cliente.repository;

import org.springframework.data.repository.CrudRepository;

import com.binary_winters.clientsapp.cliente.model.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}