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
@Table(name="tipo_publicacion")
public class TipoPublicacion {

	@Id
	@Column(name="id_tipo_publicacion")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idTipoPublicacion;
	private long descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_publicacion", nullable = false)
	private Publicacion publicacion;

	
}
