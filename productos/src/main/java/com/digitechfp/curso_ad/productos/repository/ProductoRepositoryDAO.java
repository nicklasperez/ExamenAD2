package com.digitechfp.curso_ad.productos.repository;

import com.digitechfp.curso_ad.productos.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepositoryDAO extends JpaRepository<Producto, Long> {

    @Query("SELECT p FROM Producto p WHERE p.precio < :precio")
    List<Producto> findByPrecioLessThan(@Param("precio") int precio);
}