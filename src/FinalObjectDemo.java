import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class FinalObjectDemo {
	public static void main(String[] args) {
/*		final A a=new A();
		a.setI(12);
		a.setJ(15);
		System.out.println(a);
		a.setI(121);
		a.setJ(151);
		System.out.println(a);
		String s1="ABC";
		String s2="PQR";
		s1.equals(s2);
		Integer i1=10;
		Integer i2=new Integer(10);
		System.out.println("i1==i2  "+(i1==12));
		System.out.println("i1 equals i2  "+(i1.equals(i2)));
		//String s=new String(null);
		int x=0;
		if(x==10)
		System.out.println("TEn");
		System.out.println("NUMBER");
	//	String s=null;
		//System.out.println("s=  "+s.length());
		String as="abc";
		String ss=new String(as);
		System.out.println("as==ss  "+(as==ss));
		*/
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(100);
		a2.add(200);
		a2.add(300);
		ArrayList<ArrayList> a3=new ArrayList<ArrayList>();
		a3.add(a1);
		a3.add(a2);
		Iterator itr=a3.iterator();
		while(itr.hasNext()){
			ArrayList<Integer> a4= (ArrayList<Integer>)itr.next();
			Iterator itr1=a4.iterator();
			while(itr1.hasNext()){
				System.out.println(itr1.next());
			}
		}
	}
}

class A{
	int i;
	int j;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + "]";
	}
	
	
}