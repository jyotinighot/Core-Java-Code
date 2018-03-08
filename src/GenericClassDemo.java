
public class GenericClassDemo {

	public static void main(String[] args) {
		AA<String> aa=new AA("Jyoti", "Jui");
		aa.displayData();
		AA<Integer> aa1=new AA(100,200);
		
		aa1.displayData();
	}

}
class AA<T>{
	T i;
	T j;
	
	public T getI() {
		return i;
	}

	public void setI(T i) {
		this.i = i;
	}

	public T getJ() {
		return j;
	}

	public void setJ(T j) {
		this.j = j;
	}

	public void displayData()
	{
		System.out.println(" Type is  " +i.getClass().getName());
	}

	AA(T i, T j) {
		super();
		this.i = i;
		this.j = j;
	}
	
}