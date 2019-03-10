package com.poli.eventos.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.poli.eventos.model.entities.Usuario;
import com.poli.eventos.repositories.UsuarioRepository;
@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@RequestMapping("/obtenerUsuarios")
	public Iterable<Usuario> getAllUsers () {
		
		Iterable<Usuario> findAll = usuarioRepository.findAll();
		
		return findAll;
		
	}
	
	@RequestMapping(value="/añadirUsuario", method = RequestMethod.GET)
    public String añadirUsuario(@RequestBody Usuario usuario) {//REST Endpoint.
    	usuarioRepository.save(usuario);
    	return"Usuario Insertado";
    }

	
}
