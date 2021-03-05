package br.com.springdataredis.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter 
@Setter
@RedisHash("Product")
public class Cliente implements Serializable {

	@Id
	private Long id;
	private String firstName;
	private String secondName;
	private Integer idade;
	private String email;
    private Date age;
}
