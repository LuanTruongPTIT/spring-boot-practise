package com.social_x.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

import java.util.Arrays;

@Configuration
public class OpenApiConfig {
  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
        .servers(Arrays.asList(
            new Server().url("http://localhost:8080")))
        .info(new io.swagger.v3.oas.models.info.Info()
            .title("SOCIAL X API")
            .description("Sample OpenAPI 3.0")
            .contact(new Contact()
                .email("n19dcat047@student.ptithcm.edu.vn")
                .name("Truong Luan"))
            .license(new License()
                .name("Apache 2.0")
                .url("http://www.apache.org/licenses/LICENSE-2.0.html"))
            .version("1.0.0"));
  }
}
