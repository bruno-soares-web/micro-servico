package br.com.springdataredis.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import br.com.springdataredis.model.Cliente;

@Repository
public interface ClienteRepository{


    public static final String HASH_KEY = "Product";

    @Autowired
    private RedisTemplate template;
    
    public Cliente save(Cliente cliente){
        template.opsForHash().put(HASH_KEY,cliente.getId,cliente);
        return clienteModel;
    }

    public List<Cliente> findAll(){
        return template.opsForHash().values(HASH_KEY);
    }

    public Cliente findClienteById(int id){
        System.out.println("called findProductById() from DB");
        return (Cliente) template.opsForHash().get(HASH_KEY,id);
    }


    public String deleteProduct(int id){
         template.opsForHash().delete(HASH_KEY,id);
        return "product removed !!";
    }

}
