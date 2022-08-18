package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IAlmacenDAO;
import com.example.api_rest.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{

	@Autowired
	IAlmacenDAO iAlmacenDAO;

	@Override
	public List<Almacen> listarAlmacenes() {
		// TODO Auto-generated method stub
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		// TODO Auto-generated method stub
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen almacenXID(int codigo) {
		// TODO Auto-generated method stub
		return iAlmacenDAO.findById(codigo).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		// TODO Auto-generated method stub
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(int codigo) {
		// TODO Auto-generated method stub
		iAlmacenDAO.deleteById(codigo);
	}
	
	

}
