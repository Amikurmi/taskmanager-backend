package com.amit.taskmanager.config;

import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.security.*;

import org.springframework.context.annotation.*;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .addSecurityItem(new SecurityRequirement().addList("BearerAuth"))
                .components(
                        new Components()
                                .addSecuritySchemes(
                                        "BearerAuth",
                                        new SecurityScheme()
                                                .type(SecurityScheme.Type.HTTP)
                                                .scheme("bearer")
                                                .bearerFormat("JWT")));
    }
}