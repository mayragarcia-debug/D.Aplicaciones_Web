package com.techstore.ventas_api03.repository;

import com.techstore.ventas_api03.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}