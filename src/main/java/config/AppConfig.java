package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Creating and managing the objects (@Confiuration, @Bean)
@Configuration
@ComponentScan(basePackages = "beans")
public class AppConfig {
    @Bean
    public String getMessageType() {
        return "long";
    }
}
