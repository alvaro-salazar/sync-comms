package com.example.pedidoservicedemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "producto-service")
public interface ProductoCliente {

    @GetMapping("/productos/productos")
    List<ProductoDTO> obtenerProductos();
}
