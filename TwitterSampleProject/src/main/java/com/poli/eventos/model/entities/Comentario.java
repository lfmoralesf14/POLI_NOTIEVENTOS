package com.poli.eventos.model.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="comentario")
public class Comentario {
	
	@Id
	private Long id_comentario;
	private String fecha;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_publicacion", nullable = false)
	private Publicacion publicacion;

	
	public Publicacion getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}

	private long id_usuario_comentador;
	String descripcion;

	public Long getId_comentario() {
		return id_comentario;
	}

	public void setId_comentario(Long id_comentario) {
		this.id_comentario = id_comentario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public long getId_usuario_comentador() {
		return id_usuario_comentador;
	}

	public void setId_usuario_comentador(long id_usuario_comentador) {
		this.id_usuario_comentador = id_usuario_comentador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
