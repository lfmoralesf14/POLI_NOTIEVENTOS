package com.poli.eventos.model.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mensaje_Usuario")
public class Mensaje_Usuario {
	
	@Id
	@Column(name="id_mensaje_usuario")
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private String fecha;
	private long id_usuario_origen;
	private long id_seguidor_destino;
	
	@OneToMany (fetch=FetchType.LAZY, mappedBy="mensajeUsuario")
    private Set<Mensaje> mensajes= new HashSet<Mensaje> (0);
	
	@OneToMany (fetch=FetchType.LAZY, mappedBy="mensajeUsuario")
    private Set<Usuario> usuarios= new HashSet<Usuario> (0);

	public Set<Mensaje> getMensajes() {
		return mensajes;
	}
	public void setMensajes(Set<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public long getId_usuario_origen() {
		return id_usuario_origen;
	}
	public void setId_usuario_origen(long id_usuario_origen) {
		this.id_usuario_origen = id_usuario_origen;
	}
	public long getId_seguidor_destino() {
		return id_seguidor_destino;
	}
	public void setId_seguidor_destino(long id_seguidor_destino) {
		this.id_seguidor_destino = id_seguidor_destino;
	}

}
