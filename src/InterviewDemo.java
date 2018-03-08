import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class InterviewDemo {

	public static void main(String[] args) {
		try {

			// print a message
			//System.out.println("Executing notepad.exe");

			// create a process and execute notepad.exe
			Process process = Runtime.getRuntime().exec("notepad.exe");
			Object process = Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			System.out.println(Runtime.getRuntime().availableProcessors());  
			Runtime r=Runtime.getRuntime();
			System.out.println("Total Memory "+r.totalMemory());
			System.out.println("Free Memory "+r.freeMemory());
			System.out.println("Used Memory "+(r.totalMemory()-r.freeMemory()));
			for(int i=0;i<15000;i++)
			{
				new InterviewDemo();
			}
			System.out.println("After Total Memory "+r.totalMemory());
			System.out.println("After Free Memory "+r.freeMemory());
			System.out.println("Used Memory "+(r.totalMemory()-r.freeMemory()));
			Product p=new Product();
			System.out.println("Class Name "+p.getClass());
			System.out.println("Class Name Modifieres "+p.getClass().getModifiers());
			System.out.println("Class Name  Interfaces "+p.getClass().getInterfaces().length);
			Object[] r1=p.getClass().getInterfaces();
			System.out.println("Interfaces ==   "+Arrays.asList(r1));
			System.out.println("Class Name Methods  "+p.getClass().getDeclaredMethods().length);
			Object[] s=p.getClass().getDeclaredMethods();
			System.out.println("Interfaces ==   "+Arrays.asList(s));
		/*	for (Method method : s) {
				System.out.println( " Method name=  "+ method);
			}*/
			System.out.println("Class Name "+p.getClass().getName());
			@SuppressWarnings("unchecked")
			Class<Product>s1=(Class<Product>) p.getClass().getSuperclass();
			System.out.println(p.getClass().getSuperclass());
		//	Class<s1>s2=(Class<s2>) p.getClass().getSuperclass();
			Field[] v = p.getClass().getFields();
			for (Field field : v) {
				System.out.println("++ "+field);
			}
			System.out.println("Fields ==   "+Arrays.asList(v));
			Constructor<?>[] cc =p.getClass().getConstructors();
			System.out.println("Constructor==   "+Arrays.asList(cc));
			
			System.out.println("Packages   ="+p.getClass().getPackage());
			//System.out.println("Superclass   "+s1);
			// print another message
			//System.out.println("Notepad should now open.");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

class p{
	private int pdata;

	/**
	 * @return the pdata
	 */
	public int getPdata() {
		return pdata;
	}

	/**
	 * @param pdata the pdata to set
	 */
	public void setPdata(int pdata) {
		this.pdata = pdata;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "p [pdata=" + pdata + "]";
	}

	/*private p() {
		super();
		// TODO Auto-generated constructor stub
	}*/
	
}

class Product extends p implements Serializable,Runnable {
	private String name;
	private double price;
	private String manufacturer;
	public String getName() {
		return name;
	}
	public void  m1(){
		System.out.println("m1 method");
	}
	public void  m2(){
		System.out.println("m2 method");
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void run()
	{
		System.out.println("Runnable ");
	
	}

}

