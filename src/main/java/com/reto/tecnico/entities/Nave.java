package com.reto.tecnico.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Nave {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name="combustible_id")
	private Combustible combustible;
	
	@ManyToOne
	@JoinColumn(name="clase_nave_id")
	private ClaseNave tipo;
	
	@Column(nullable = false, length = 100)
	private String nombre;

	@Column(nullable = false, length = 60)
	private String paisOrigen;

	@Column(nullable = false)
	private float altura;

	@Column(nullable = false)
	private float peso;

	public Nave(Long id, Combustible combustible, ClaseNave tipo, String nombre, String paisOrigen, float altura,
			float peso) {
		super();
		this.id = id;
		this.combustible = combustible;
		this.tipo = tipo;
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
		this.altura = altura;
		this.peso = peso;
	}

	public Nave() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	public ClaseNave getTipo() {
		return tipo;
	}

	public void setTipo(ClaseNave tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	
}
