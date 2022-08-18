package com.example.api_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_rest.dto.Almacen;
import com.example.api_rest.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {
	
	@Autowired
	AlmacenServiceImpl departamentoServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes(){
		return departamentoServiceImpl.listarAlmacenes();
	}
	
	@GetMapping("/almacenes/{codigo}")
	public Almacen almacenXID(@PathVariable(name="codigo") int codigo) {
		return departamentoServiceImpl.almacenXID(codigo);
	}
	
	@PostMapping("/almacenes")
	public Almacen guardarAlmacen(@RequestBody Almacen almacen) {
		return departamentoServiceImpl.guardarAlmacen(almacen);
	}
	
	@PutMapping("/almacenes/{codigo}")
	public Almacen actualizarAlmacen(@PathVariable(name="codigo")int codigo, @RequestBody Almacen almacen) {
		Almacen almacenActualizado = departamentoServiceImpl.almacenXID(codigo);
		
		almacenActualizado.seLugar(almacen.getLugar());
		almacenActualizado.setCapacidad(almacen.getCapacidad());
		
		return departamentoServiceImpl.actualizarAlmacen(almacenActualizado);
	}
	
	@DeleteMapping("/almacenes/{codigo}")
	public void eliminarAlmacen (@PathVariable(name="codigo")int codigo) {
		departamentoServiceImpl.eliminarAlmacen(codigo);
	}
}
