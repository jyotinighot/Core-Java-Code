import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CallableInterface {
	public static void main(String[] args) {
		MyThread r=new MyThread();
		Callable<String> callable = new MyThread();
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Future<String> future = executor.submit(callable);
		System.out.println("Thread Priority=  "+future.toString());		//int x= ;
	}
}

class MyThread implements Callable<String>
{
	@Override
	public String call() throws Exception {
		System.out.println("Hello");
		return Thread.currentThread().getName();
	}
}