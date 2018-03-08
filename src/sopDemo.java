import java.io.*;
import java.lang.reflect.Constructor;
import java.util.HashMap;


public class sopDemo {
	public static void main(String[] args) throws Throwable {
		
		  // By using new keyword
        Employee emp1 = new Employee();
        emp1.setName("Naresh");
        System.out.println(emp1 + ", hashcode : " + emp1.hashCode());
        // By using Class class's newInstance() method
        Employee emp2 = (Employee) Class.forName("Employee")
                               .newInstance();
        // Or we can simply do this
        // Employee emp2 = Employee.class.newInstance();
        emp2.setName("Rishi");
        System.out.println("Using Class class "+emp2 + ", hashcode : " + emp2.hashCode());
        // By using Constructor class's newInstance() method
        Constructor<Employee> constructor = Employee.class.getConstructor();
        Employee emp3 = constructor.newInstance();
        emp3.setName("Yogesh");
        System.out.println("Using Construstor class "+emp3 + ", hashcode : " + emp3.hashCode());
        // By using clone() method
        Employee emp4 = (Employee) emp3.clone();
        emp4.setName("Atul");
        System.out.println("Using cloning "+emp4 + ", hashcode : " + emp4.hashCode());
        // By using Deserialization
        // Serialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
        out.writeObject(emp4);
        out.close();
        //Deserialization
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
        Employee emp5 = (Employee) in.readObject();
        in.close();
        emp5.setName("Akash");
        System.out.println("Using Deserialization "+emp5 + ", hashcode : " + emp5.hashCode());
        HashMap<Integer,String>hmap= new HashMap<Integer,String>();
        System.out.println(hmap.put(10, "Hello"));
        System.out.println(hmap.put(15, "Hi")); 
        System.out.println(hmap.put(10, "Jyoti"));
        //emp4.finalize();
        /*
        Object i = Integer.valueOf(42);
        String s = (String)i; */
        
    }
}
class Employee implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    public Employee() {
        System.out.println("Employee Constructor Called...");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + "]";
    }
    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}