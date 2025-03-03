package config;

import messages.MessageReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "messages")
public class ProjectConfig {
    @Bean
    public MessageReader messageReader(String getMessage, Integer getAge) {
        return new MessageReader(getMessage, getAge);
    }
}
