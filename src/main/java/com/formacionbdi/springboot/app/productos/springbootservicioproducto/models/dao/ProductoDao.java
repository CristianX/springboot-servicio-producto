package com.formacionbdi.springboot.app.productos.springbootservicioproducto.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.springboot.app.productos.springbootservicioproducto.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
