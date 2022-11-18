package co.com.example.tienda.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.example.tienda.entities.Producto;
import co.com.example.tienda.repository.ProductoRepository;
import lombok.experimental.PackagePrivate;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	ProductoRepository productoRepository;
	

	
	@GetMapping
	public List<Producto> getProductoAll() {
		
		return productoRepository.findAll();
	}
	
	
	@GetMapping("/{id}")
	public Producto getProductosbyId(@PathVariable Integer id) {
		Optional<Producto> producto= productoRepository.findById(id);
		
		if(producto.isPresent()) {
			return producto.get();
		}
		return null;
	}
}
