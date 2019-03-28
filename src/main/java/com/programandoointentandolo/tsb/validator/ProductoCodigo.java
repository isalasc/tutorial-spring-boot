package com.programandoointentandolo.tsb.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Comprueba que la suma de los caracteres del codigo este dentro del rango valido
 */
@Documented
@Constraint(validatedBy = ProductoCodigoValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ProductoCodigo {
	String message() default "{productoCodigoValido.mensajePorDefecto}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
