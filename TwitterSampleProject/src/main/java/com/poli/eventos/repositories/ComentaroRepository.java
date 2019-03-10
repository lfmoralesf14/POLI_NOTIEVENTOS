package com.poli.eventos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poli.eventos.model.entities.Comentario;
import com.poli.eventos.model.entities.Usuario;

//import com.poli.devweb.model.entities.User;

@Repository
public interface ComentaroRepository extends CrudRepository<Comentario, Long> {
	
//	public User findById(long id);
	
	//public List<User> findByEmail(String email);
}
