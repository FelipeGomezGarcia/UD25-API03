package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Caja;

public interface ICajaService {
	
	public List<Caja> listarCajas();
	
	public Caja guardarCaja(Caja caja);
	
	public Caja cajaXID(String numReferencia);
	
	public Caja actualizarCaja(Caja caja);
	
	public void eliminarCaja(String numReferencia);
}
