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
@Table(name="contenido")
public class Contenido {
	
	@Id
	@Column(name="id_contenido")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idContenido;
	private String rutaContenido;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_publicacion", nullable = false)
	private Publicacion publicacion;

    @OneToMany (fetch=FetchType.LAZY, mappedBy="contenido")
    private Set<TipoContenido> tipoContenido= new HashSet<TipoContenido> (0); 
    
	public Long getIdContenido() {
		return idContenido;
	}

	public void setIdContenido(Long idContenido) {
		this.idContenido = idContenido;
	}

	public String getRutaContenido() {
		return rutaContenido;
	}

	public void setRutaContenido(String rutaContenido) {
		this.rutaContenido = rutaContenido;
	}

	public Publicacion getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}
	
			
}
