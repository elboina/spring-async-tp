package fr.worldline.spring.training.main;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.worldline.spring.training.asynch.AsyncComponent;
import fr.worldline.spring.training.configuration.SpringAsyncConfig;

public class DemoAsync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringAsyncConfig.class);
		AsyncComponent asyncComponent = (AsyncComponent) context.getBean("asyncComponent");
		
		try {
			Future<String> future = asyncComponent.asyncMethodWithFutureReturnType();
			while (true) {
				if (future.isDone()) {
					System.out.println("Result from asynchronous process : ".concat(future.get()));
					context.close();
					break;
				}
				
				System.out.println("Continue doing something else");
				Thread.sleep(1000);
			}
			
			System.out.println("End -invoking as asynchronous thread : " + Thread.currentThread().getName());
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
