package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Almacen;

public interface IAlmacenService {

	public List<Almacen> listarAlmacenes();
	
	public Almacen guardarAlmacen(Almacen almacen);
	
	public Almacen almacenXID(int codigo);
	
	public Almacen actualizarAlmacen(Almacen almacen);
	
	public void eliminarAlmacen(int codigo);
}
