package com.programandoointentandolo.tsb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.programandoointentandolo.tsb.validator.ProductoCodigo;
import com.programandoointentandolo.tsb.validator.ProductoPrecioUnidadesMinimo;
import com.programandoointentandolo.tsb.validator.grupos.Crear;
import com.programandoointentandolo.tsb.validator.grupos.Editar;

@ProductoPrecioUnidadesMinimo
@Entity
public class Producto {

	@Id
	@Null(groups = Crear.class)
	@NotNull(groups = Editar.class)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ProductoCodigo
	@Size(min = 3, max = 8)
	@Pattern(regexp = "[A-Z0-9]+")
	private String codigo;

	@NotEmpty
	private String nombre;

	@NotNull
	@Min(value = 2, groups = {Crear.class, Editar.class})
	@Max(100)
	private Double precio;
	
	@NotNull
	@Min(1)
	private Integer unidadesMinimas;

	public Producto() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getUnidadesMinimas() {
		return unidadesMinimas;
	}

	public void setUnidadesMinimas(Integer unidadesMinimas) {
		this.unidadesMinimas = unidadesMinimas;
	}

}
