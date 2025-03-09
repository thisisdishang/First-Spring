package config;

import beans.BubbleSort;
import beans.InsertionSort;
import org.springframework.context.annotation.*;

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

    @Bean
    @Primary
    public BubbleSort bubbleSort() {
        return new BubbleSort();
    }

    @Bean
    public InsertionSort insertionSort() {
        return new InsertionSort();
    }

}
