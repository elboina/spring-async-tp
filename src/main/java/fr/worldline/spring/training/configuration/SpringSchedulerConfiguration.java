package fr.worldline.spring.training.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages = "fr.worldline.spring.training.scheduler")
@EnableScheduling
public class SpringSchedulerConfiguration {

}
