package fr.worldline.spring.training.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleComponent {
	
	@Scheduled(fixedDelay = 4000L, initialDelay = 1000L)
	public void scheduledMethod() {
		System.out.println("Execute method @Scheduled " + Thread.currentThread().getName());
	}

}
