package com.reto.tecnico.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClaseNave {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 100)
	private String tipoNave;

	public ClaseNave(Long id, String tipoNave) {
		super();
		this.id = id;
		this.tipoNave = tipoNave;
	}

	public ClaseNave() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoNave() {
		return tipoNave;
	}

	public void setTipoNave(String tipoNave) {
		this.tipoNave = tipoNave;
	}
	
	
}
