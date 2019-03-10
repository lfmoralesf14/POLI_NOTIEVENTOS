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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="publicacion")
public class Publicacion {
	
    @Id
    @Column(name="id_publicacion")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idPublicacion;

    private String fecha;
    private String detalle;
    
    @OneToMany (fetch=FetchType.LAZY, mappedBy="publicacion")
    private Set<Comentario> comentarios = new HashSet<Comentario> (0);
    
    @OneToMany (fetch=FetchType.LAZY, mappedBy="publicacion")
    private Set<TipoPublicacion>  tipoPublicacion= new HashSet<TipoPublicacion> (0); 

    @OneToMany (fetch=FetchType.LAZY, mappedBy="publicacion")
    private Set<Contenido> contenido= new HashSet<Contenido> (0); 

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario usuario;


}