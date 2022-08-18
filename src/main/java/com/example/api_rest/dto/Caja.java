package com.example.api_rest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cajas")
public class Caja {
	
	@Id
	@Column(name = "numreferencia")
	String numReferencia;
	@Column(name = "Contenido")
	String contenido;
	@Column(name = "Valor")
	int valor;
	
	@ManyToOne
	@JoinColumn(name = "Almacen")
	Almacen almacen;

	public Caja() {
		
	}

	public Caja(String numReferencia, String contenido, int valor, Almacen almacen) {
		this.numReferencia = numReferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	/**
	 * @return the numReferencia
	 */
	public String getNumReferencia() {
		return numReferencia;
	}

	/**
	 * @param numReferencia the numReferencia to set
	 */
	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}

	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * @return the almacen
	 */
	public Almacen getAlmacen() {
		return almacen;
	}

	/**
	 * @param almacen the almacen to set
	 */
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [numReferencia=" + numReferencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}

	
	
	
	
}
