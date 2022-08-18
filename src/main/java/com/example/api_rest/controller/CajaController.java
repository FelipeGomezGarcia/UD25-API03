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

import com.example.api_rest.dto.Caja;
import com.example.api_rest.service.CajaServiceImpl;

@RestController
@RequestMapping("/api")
public class CajaController {
	
	@Autowired
	CajaServiceImpl cajaServiceImpl;
	
	@GetMapping("/cajas")
	public List<Caja> listarCajas(){
		return cajaServiceImpl.listarCajas();
	}
	
	@GetMapping("/cajas/{numreferencia}")
	public Caja cajaXID(@PathVariable(name="numreferencia") String numReferencia) {
		return cajaServiceImpl.cajaXID(numReferencia);
	}
	
	@PostMapping("/cajas")
	public Caja guardarCaja(@RequestBody Caja caja) {
		return cajaServiceImpl.guardarCaja(caja);
	}
	
	@PutMapping("/cajas/{numreferencia}")
	public Caja actualizarCaja(@PathVariable(name="numreferencia")String numReferencia, @RequestBody Caja caja) {
		Caja cajaActualizado = cajaServiceImpl.cajaXID(numReferencia);
		
		cajaActualizado.setContenido(caja.getContenido());
		cajaActualizado.setValor(caja.getValor());
		cajaActualizado.setAlmacen(caja.getAlmacen());
		
		return cajaServiceImpl.actualizarCaja(cajaActualizado);
	}
	
	@DeleteMapping("/cajas/{numreferencia}")
	public void eliminarCaja(@PathVariable(name="numreferencia")String numReferencia) {
		cajaServiceImpl.eliminarCaja(numReferencia);
	}
}
