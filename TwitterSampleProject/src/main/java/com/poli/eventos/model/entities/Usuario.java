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
@Table(name="usuario")
public class Usuario {

	@Id
	@Column(name="id_usuario")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long  idUsuario;
	private String nombre;
	private String apellido;
	private String usuario;
	private String contraseña;
	private long estado;
	
	
	
    @OneToMany (fetch=FetchType.LAZY, mappedBy="usuario")
    private Set<Publicacion> publicaciones= new HashSet<Publicacion> (0);

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_mensaje_usuario", nullable = false)
	private Mensaje_Usuario mensajeUsuario;

	public long getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getContraseña() {
		return contraseña;
	}



	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}



	public long getEstado() {
		return estado;
	}



	public void setEstado(long estado) {
		this.estado = estado;
	}



	public Set<Publicacion> getPublicaciones() {
		return publicaciones;
	}



	public void setPublicaciones(Set<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
  
}
