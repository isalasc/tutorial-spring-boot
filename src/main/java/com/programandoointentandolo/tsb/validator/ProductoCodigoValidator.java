package com.programandoointentandolo.tsb.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ProductoCodigoValidator implements ConstraintValidator<ProductoCodigo, String> {

	private static final int MAX = 500;
	private static final int MIN = 250;

	@Override
	public boolean isValid(String codigo, ConstraintValidatorContext context) {
		int suma = codigo.chars().sum();

		return suma > MIN && suma < MAX;
	}

}
