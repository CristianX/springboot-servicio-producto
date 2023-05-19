package com.formacionbdi.springboot.app.productos.springbootservicioproducto.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.productos.springbootservicioproducto.models.entity.Producto;

public interface IProductoService {

    public List<Producto> findAll();

    public Producto findById(Long id);

}
