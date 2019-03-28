package com.programandoointentandolo.tsb.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.programandoointentandolo.tsb.entity.Producto;

public class ProductoPrecioUnidadesMinimoValidator
		implements ConstraintValidator<ProductoPrecioUnidadesMinimo, Producto> {

	@Override
	public boolean isValid(Producto producto, ConstraintValidatorContext context) {
		if (producto.getPrecio() == null || producto.getUnidadesMinimas() == null) {
			return false;
		}
		
		return producto.getPrecio() * producto.getUnidadesMinimas() > 10;
	}

}
