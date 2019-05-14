package fr.worldline.spring.training.asynch;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncComponent {
	
	@Async
	public Future<String> asyncMethodWithFutureReturnType() throws InterruptedException {
		Thread.sleep(5000);
		
		System.out.println("Execute method asynchronously " + Thread.currentThread().getName());
		
		Future<String> future = new Future<String>() {

			public boolean cancel(boolean mayInterruptIfRunning) {
				// TODO Auto-generated method stub
				return false;
			}

			public String get() throws InterruptedException, ExecutionException {
				// TODO Auto-generated method stub
				return "Execution completed";
			}

			public String get(long timeout, TimeUnit unit)
					throws InterruptedException, ExecutionException, TimeoutException {
				// TODO Auto-generated method stub
				return "Execution completed";
			}

			public boolean isCancelled() {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean isDone() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		return future;
	}

}
