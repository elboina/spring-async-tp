package fr.worldline.spring.training.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.worldline.spring.training.configuration.SpringSchedulerConfiguration;
import fr.worldline.spring.training.scheduler.ScheduleComponent;

public class DemoScheduling {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringSchedulerConfiguration.class);
		ScheduleComponent component = (ScheduleComponent) context.getBean("scheduleComponent");
		component.scheduledMethod();

	}

}
