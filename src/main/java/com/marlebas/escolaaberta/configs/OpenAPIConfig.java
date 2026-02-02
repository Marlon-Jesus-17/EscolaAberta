package com.marlebas.escolaaberta.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI customizarAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("API Escola Aberta")
                        .version("1.0")
                        .description("Sistema de busca de escolas e cursos extracurriculares.")
                        .contact(new Contact().name("Marlon dos Santos Santana de Jesus").email("maarlonsantos17@gmail.com")));
    }
}
