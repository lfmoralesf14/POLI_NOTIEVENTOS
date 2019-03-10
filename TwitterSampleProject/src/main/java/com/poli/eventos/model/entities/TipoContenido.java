package com.poli.eventos.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tipo_contenido")
public class TipoContenido {
	
	@Id
	@Column(name="id_tipo_contenido")
	private Long idTipoContenido;
	String descripcion;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_contenido", nullable = false)
	private Contenido contenido;

	
}
