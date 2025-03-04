package config;

import messages.MessageReader;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "messages")
public class ProjectConfig {
    @Bean
    public MessageReader messageReader(@Qualifier("getMessage") String getMessage, Integer getAge) {
        return new MessageReader(getMessage, getAge);
    }
}
