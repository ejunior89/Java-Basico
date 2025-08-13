package com.example.seguranca.gerenciador_de_usuarios.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("Gerenciador de Usuários API")
            .version("1.0.0")
            .description("API para gerenciamento de usuários")
            .contact(new Contact()
                .name("Suporte API")
                .url("http://www.github.com/ejunior89")
                .email("eliomaiajunior@gmail.com")
            )
        );
  }
}
