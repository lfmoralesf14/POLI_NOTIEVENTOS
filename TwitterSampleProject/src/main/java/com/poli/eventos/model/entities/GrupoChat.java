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
@Table(name="grupo_chat")
public class GrupoChat {

	@Id
	@Column(name="id_grupo_chat")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idGrupoChat;
	private long idCategoria;
	public long getIdGrupoChat() {
		return idGrupoChat;
	}
	public void setIdGrupoChat(long idGrupoChat) {
		this.idGrupoChat = idGrupoChat;
	}
	public long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}
}
