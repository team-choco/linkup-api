package com.kakaotrack.choco.linkupapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class LinkupApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkupApiApplication.class, args);
	}

	@Configuration
	public class WebConfig implements WebMvcConfigurer {
		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
					.allowedOrigins("http://localhost:4200")
					.allowedMethods("PUT","DELETE","GET","POST");
		}
	}

}
