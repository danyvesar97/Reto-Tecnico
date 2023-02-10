package com.reto.tecnico.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Combustible { /* Estructura de la clase Combustible */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 100)
	private String tipoCombustible;

	public Combustible(Long id, String tipoCombustible) {
		super();
		this.id = id;
		this.tipoCombustible = tipoCombustible;
	}

	public Combustible() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public Combustible(Long id) {
		super();
		this.id = id;
	}

	public Combustible(String tipoCombustible) {
		super();
		this.tipoCombustible = tipoCombustible;
	}
}
