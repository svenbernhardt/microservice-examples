package com.opitzconsulting.demo.hellomicroservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by svb on 21.08.18.
 */
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebConfig.class);

    @Bean
    public WebMvcConfigurer corsConfigurer() {

	LOGGER.debug("################ Enabling CORS support!");
	return new WebMvcConfigurerAdapter() {
	    @Override
	    public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/api/**").allowedOrigins("*")
				.allowedMethods("PUT", "POST", "GET", "OPTIONS", "DELETE")
				.allowedHeaders("origin", "content-type", "accept", "authorization");
	    }
	};
    }
}

