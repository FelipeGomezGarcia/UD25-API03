package com.example.api_rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "almacenes")
public class Almacen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo;
	@Column(name="lugar")
	String lugar;
	@Column(name="capacidad")
	int capacidad;
	
	@OneToMany
	@JoinColumn(name="codigo")
	List<Caja> cajas;

	public Almacen() {
		
	}

	public Almacen(int codigo, String lugar, int capacidad) {
		this.codigo = codigo;
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void seLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the cajas
	 */
	public List<Caja> getCajas() {
		return cajas;
	}

	/**
	 * @param cajas the cajas to set
	 */
	@JsonIgnore
	@OneToMany(fetch =  FetchType.LAZY, mappedBy = "Caja")
	public void setCajas(List<Caja> cajas) {
		this.cajas = cajas;
	}

	@Override
	public String toString() {
		return "Almacen [codigo=" + codigo + ", lugar=" + lugar + ", capacidad=" + capacidad + "]";
	}
	
	
}
