package mingu.spring.axon2.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "Event Sourcing using Axon and Spring Boot",
        description = "App to demonstrate Event Sourcing using Axon and Spring Boot",
        version = "1.0.0"))
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi openApi() {
        return GroupedOpenApi.builder()
                .group("Axon2")
                .pathsToMatch("/bank-accounts/**")
                .build();
    }
}
