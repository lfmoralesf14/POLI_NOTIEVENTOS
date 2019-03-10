package com.poli.eventos.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.poli.eventos.model.entities.Publicacion;
import com.poli.eventos.model.entities.Usuario;
import com.poli.eventos.repositories.PublicacionRepository;
import com.poli.eventos.repositories.UsuarioRepository;

@RestController
public class publicacionesController {
	
	@Autowired
	private PublicacionRepository PublicacionRepositoryDAO;
	
	@RequestMapping("/obtenerPublicaciones")
	public Iterable<Publicacion> getAllUsers () {
		
		Iterable<Publicacion> findAll = PublicacionRepositoryDAO.findAll();
		
		return findAll;
		
	}
	
	@RequestMapping(value="/añadirPublicacion", method = RequestMethod.GET)
    public String añadirPublicacion(@RequestBody Publicacion publicacion) {//REST Endpoint.
		PublicacionRepositoryDAO.save(publicacion);
    	return"Publicación Insertada";
    }
}
