package br.com.springdataredis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springdataredis.model.ClienteModel;
import br.com.springdataredis.repository.ClienteRepository;

@Service
public class ClienteService {


	@Autowired
	ClienteRepository clienteRepository;
		
	public ClienteModel create(ClienteModel clienteModel) {
		return clienteRepository.save(clienteModel);
	}
	
	public List<ClienteModel> findAll() {
		return clienteRepository.findAll();
	}	
	
	public ClienteModel findById(int id) {

		return clienteRepository.findById(id);
				
	}
		
	public ClienteModel update(ClienteModel clienteModel) {
		ClienteModel entity = clienteRepository.findById(clienteModel.getId());
				//.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		
		entity.setFirstName(clienteModel.getFirstName());
		entity.setSecondName(clienteModel.getSecondName());
		entity.setSecondName(clienteModel.getSecondName());
		entity.setIdade(clienteModel.getIdade());
		entity.setEmail(clienteModel.getEmail());
		entity.setAge(clienteModel.getAge());
		
		return clienteRepository.save(entity);
	}	
	
	public String delete(int id) {
		return clienteRepository.delete(id);
	}

}
