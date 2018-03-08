/*
import java.util.concurrent.TimeUnit;
 class SampleThread extends Thread {
    public SampleThread() {
        super();
        System.out.println("An instance of the " + SampleThread.class + " class was created!");
    }
    public void run() {
        try {
           // TimeUnit.SECONDS.sleep(10);
        	Thread.sleep(15);
        }
        catch(InterruptedException ex) {
            System.err.println("An InterruptedException was caught: " + ex.getMessage());
        }
    }
}
 public class IntrruptedExceptionDemo {
     public static void main(String[] args) throws InterruptedException {
         Thread thread = new SampleThread();
         thread.start();
         thread.interrupt();
       //  thread.join();
     }
 }
 */


public class IntrruptedExceptionDemo {
	public static void main(String[] args) {
		String s="one wst two mnl two jkl three sdtfg five asdd ten";
		String[] replaceString=null;
		String[] ar={"one","two","three","four","five","six","seven","eight","nine","ten"};
		int i;
		for( i=0;i<ar.length;i++){
			//System.out.println(ar[i]);
			replaceString[i]=s.replaceAll(ar[i],String.valueOf(i+1));
		}
		System.out.println(replaceString);
	}
}