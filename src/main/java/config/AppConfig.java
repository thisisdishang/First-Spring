package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// Creating and managing the objects (@Confiuration, @Bean)
@Configuration
@ComponentScan(basePackages = "beans")
@PropertySource("application.properties")
public class AppConfig {
//    @Bean
//    public String getMessageType() {
//        return "long";
//    }

    @Bean
    public String getName() {
        return "Hello, Genesis";
    }

    @Bean
    public String getMessage() {
        return "Hii, Sherlock!";
    }

    @Bean
    public Integer getAge() {
        return 22;
    }

}
