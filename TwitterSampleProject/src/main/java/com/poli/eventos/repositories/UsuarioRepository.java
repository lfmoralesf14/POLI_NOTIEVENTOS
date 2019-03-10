package com.poli.eventos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poli.eventos.model.entities.Usuario;


@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
