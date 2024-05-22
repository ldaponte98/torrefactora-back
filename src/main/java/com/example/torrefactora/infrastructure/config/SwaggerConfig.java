package com.example.torrefactora.infrastructure.config;
import lombok.Generated;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * Configuration Api doc
 * @author Luis Aponte
 * @version 0.1, 2024/05/22
 */
@Generated
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * Defined origin from documentation
     * @author Luis Aponte
     * @version 0.1, 2024/05/22
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.example.torrefactora.infrastructure.controller"))
                .paths(PathSelectors.any()).build();
    }
}
