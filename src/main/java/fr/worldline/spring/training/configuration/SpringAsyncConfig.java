package fr.worldline.spring.training.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@ComponentScan(basePackages = "fr.worldline.spring.training")
@EnableAsync
public class SpringAsyncConfig {

}
