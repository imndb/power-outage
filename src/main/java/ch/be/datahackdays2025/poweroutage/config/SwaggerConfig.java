package ch.be.datahackdays2025.poweroutage.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Power Outage API")
                        .version("1.0.0")
                        .description("API-Dokumentation für das Power Outage Projekt"));
    }
}