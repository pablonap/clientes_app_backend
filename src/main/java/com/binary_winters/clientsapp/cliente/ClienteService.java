package com.binary_winters.clientsapp.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}
	
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
	}

	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	public void delete(Cliente cliente) {
		clienteDao.delete(cliente);
		
	}

}
