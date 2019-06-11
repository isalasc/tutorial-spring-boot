package com.programandoointentandolo.tsb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class ConfiguracionValidador {

	@Autowired
	MessageSource messageSource;

	@Bean
	public LocalValidatorFactoryBean getValidator() {
		LocalValidatorFactoryBean validatorFactory = new LocalValidatorFactoryBean();
		validatorFactory.setValidationMessageSource(messageSource);
		return validatorFactory;
	}
}
