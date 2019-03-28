package com.programandoointentandolo.tsb.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Comprueba que el precio total para el numero minimo de unidades sea mayor de 10
 */
@Documented
@Constraint(validatedBy = ProductoPrecioUnidadesMinimoValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ProductoPrecioUnidadesMinimo {
	String message() default "{productoPrecioUnidadesMinimo.mensajePorDefecto}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
