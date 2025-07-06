package com.example.Escolaellis.config;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("API de Gestão Escolar")
                .version("1.0.0")
                .description("API para gerenciar alunos, cursos e matrículas em uma instituição de ensino."));
    }
}
