package com.digitechfp.curso_ad.productos.controller;

import com.digitechfp.curso_ad.productos.entity.Producto;
import com.digitechfp.curso_ad.productos.repository.ProductoRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ProductoRepositoryDAO productoRepositoryDAO;

    @GetMapping("/producto")
    public List<Producto> getAllProductos() {
        return productoRepositoryDAO.findAll();
    }

    @GetMapping("/productos/menor-precio")
    public List<Producto> getProductosByPrecioMenor(@RequestParam int precio) {
        return productoRepositoryDAO.findByPrecioLessThan(precio);
    }
}