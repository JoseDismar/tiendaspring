package co.com.example.tienda.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
//@Table(name="product")
public class Producto implements Serializable {
	@Id
	private Integer id;
	
	private String nombre;
	
	private String descripcion;
}
