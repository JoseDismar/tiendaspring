package co.com.example.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.example.tienda.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
