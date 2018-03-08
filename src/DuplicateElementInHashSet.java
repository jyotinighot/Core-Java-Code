import java.util.*;
public class DuplicateElementInHashSet {
	public static void main(String[] args) {
		Set<EEmployee> test=new HashSet<EEmployee>();
		EEmployee t1=new EEmployee(1,"sushil");
		EEmployee t2=new EEmployee(1,"sushil");

		test.add(t1);
		test.add(t2);

		Iterator<EEmployee> its=test.iterator();
		while(its.hasNext())
		{
			EEmployee value=(EEmployee)its.next();
			System.out.println("Value :"+value);		}	}}
class EEmployee{
	private int eid;
	private String ename;
	public EEmployee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;	}
	@Override
	public String toString() {
		return "EEmployee [eid=" + eid + ", ename=" + ename + "]";	}
	/* overriding equals method saying even if two objects are having same eid and ename still they are not equal, means you are giving your own definition of equals */
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj==this)
			return true;
		if( this.eid==((EEmployee)obj).eid && this.ename==((EEmployee)obj).ename)
			return false;
		return false;	}
	/* overriding hashcode() method to generate hashcode based on its eid*/
	public int hashCode() {
		return this.eid +25;	}
}
