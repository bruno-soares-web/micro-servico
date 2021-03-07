package br.com.springdataredis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springdataredis.model.ClienteModel;
import br.com.springdataredis.repository.ClienteRepository;
import br.com.springdataredis.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	 @Autowired
	    private ClienteService clienteService;

	    @PostMapping
	    public ClienteModel save(@RequestBody ClienteModel clienteModel) {
	        return clienteService.create(clienteModel);
	    }

	    @GetMapping
	    public List<ClienteModel> getAllProducts() {
	        return clienteService.findAll();
	    }

	    @GetMapping("/{id}")
	    public ClienteModel findProduct(@RequestHeader int id) {
	        return clienteService.findById(id);
	    }
	    @DeleteMapping("/{id}")
	    public String remove(@RequestHeader int id)   {
	    	return clienteService.delete(id);
		}


}
