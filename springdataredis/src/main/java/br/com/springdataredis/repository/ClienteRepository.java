package br.com.springdataredis.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import br.com.springdataredis.model.ClienteModel;

@Repository
public class ClienteRepository{


    public static final String HASH_KEY = "Cliente";
    
    @Autowired
    private RedisTemplate template;

	public ClienteModel save(ClienteModel clienteModel){
        template.opsForHash().put(HASH_KEY,clienteModel.getId(),clienteModel);
        return clienteModel;
    }

	public List<ClienteModel> findAll(){
        return template.opsForHash().values(HASH_KEY);
    }

	public ClienteModel findById(int i){
        return (ClienteModel) template.opsForHash().get(HASH_KEY,i);
    }


	public String delete(int id){
         template.opsForHash().delete(HASH_KEY,id);
        return "product removed !!";
    }
  
}
