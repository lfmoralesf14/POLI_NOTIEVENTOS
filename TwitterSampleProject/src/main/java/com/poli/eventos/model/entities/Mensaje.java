package com.poli.eventos.model.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mensaje")
public class Mensaje {

	@Id
	@Column(name="id_mensaje")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_mensaje;
	private String fecha;
	private String texto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_mensaje_usuario", nullable = false)
	private Mensaje_Usuario mensajeUsuario;
	
	public long getId_mensaje() {
		return id_mensaje;
	}

	public void setId_mensaje(long id_mensaje) {
		this.id_mensaje = id_mensaje;
	}

	
}
