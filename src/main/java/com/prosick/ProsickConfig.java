package com.prosick;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.prosick"})
public class ProsickConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver irv = new InternalResourceViewResolver();
		irv.setPrefix("WEB-INF/pages/");
		irv.setSuffix(".jsp");
		return irv;
	}
}
