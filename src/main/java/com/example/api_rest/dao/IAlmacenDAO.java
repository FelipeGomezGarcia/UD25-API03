package com.example.api_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Almacen;

public interface IAlmacenDAO extends JpaRepository<Almacen, Integer>{

}
