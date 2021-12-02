package ovgu.pave.handler;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class ThreadHandler {

	private static ExecutorService threadPool = null; 
		
	public static int getNumThreads() {
		return Handler.getConfig().getThreadCount();
	}
	
	public static int getThreadId() {
		return (int) (Thread.currentThread().getId() % getNumThreads());
	}
	
	public static void createThreadPool() {
			threadPool = Executors.newFixedThreadPool(getNumThreads());   
	}
	
	public static void shutDownThreadPool() {
		threadPool.shutdown();
	}
	
	public static List<Future<Object>> run(List<Callable<Object>> callableTasks) {

		try {
			List<Future<Object>> futures = threadPool.invokeAll(callableTasks);
			return futures;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		return null;
	}
}
