
public class StringOperationsDemo {
	public static void main(String[] args) {
		String s="Object Oriented Programming Language";
		char a=s.charAt(25);
		System.out.println("a= "+a);
		/*try{
			System.out.println(s.charAt(50));	
		}
		catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		}*/
		System.out.println("Provide Correct Index ");
		s=s.concat(" JAVA");
		System.out.println("s=  "+s);
		s=s+"DEMO";
		System.out.println("s=  "+s);
		s+=" Demonstration";
		System.out.println("s=  "+s);
		String s1=s;
		System.out.println("s1=  "+s1);
		System.out.println("s==s1 using equals( ) " +s1.equals(s1));
		String s2="     Object Oriented GUAG Programming LanGUAGE JAVADEMO DemonSTRATION GUAG  ";

		/*System.out.println("s2=  "+s2);
			System.out.println("s1==s2 using equalsIgnoreCase() " +s1.equalsIgnoreCase(s1));
			System.out.println(s1.substring(35));
			System.out.println(s1.substring(25,39));
			System.out.println("s1=  "+s1.lastIndexOf('e'));
			System.out.println("s2=  "+s2.lastIndexOf("GUAG", 35));
			System.out.println(s2.toLowerCase());
			System.out.println("s2=  "+s2);
			System.out.println(s1.toUpperCase());
			System.out.println("s1=  "+s1);
			System.out.println(s1.replace('e', 'E'));
			System.out.println("Length = "+s2.length());
			System.out.println("Trim Length=  "+s2.trim().length());
		 */			System.out.println("Length = "+s2.length());
		 StringBuffer sb=new StringBuffer();
		 sb.append("abcdefg");
		 System.out.println("String Buffer   Lenght "+sb.length()+"   Capacity= "+sb.capacity()+" Hashcode= "+sb.hashCode()+" "+sb );
		
		 sb.append("abcdefghijklmnopqr");
		 System.out.println("String Buffer   Lenght "+sb.length()+"   Capacity= "+sb.capacity()+" Hashcode= "+sb.hashCode()+" "+sb);

		// sb.delete(10, 25);
		 //System.out.println("String Buffer   Lenght "+sb.length()+"   Capacity= "+sb.capacity()+" Hashcode= "+sb.hashCode()+" "+sb);

		 sb.append("abcdefghijklmnopqr");
		 System.out.println("String Buffer   Lenght "+sb.length()+"   Capacity= "+sb.capacity()+" Hashcode= "+sb.hashCode()+" "+sb);
		 sb.append(55);
		 sb.insert(5, 55.23);
		 System.out.println("String Buffer   Lenght "+sb.length()+"   Capacity= "+sb.capacity()+" Hashcode= "+sb.hashCode()+" "+sb);
		 String st="ACBFRRRR";
		 StringBuffer sb1=new StringBuffer(st);
		 sb1.append(st);
		 System.out.println("String Buffer  "+sb1);
		 System.out.println("Capacity1=  "+sb1.capacity());
		 sb1.setLength(10);
		 System.out.println("Capacity2=  "+sb1);
		 sb1.ensureCapacity(100);
		 System.out.println("Capacity3=  "+sb1);
		 sb1.trimToSize();
		 System.out.println("Capacity4=  "+sb1.capacity());
		 

	}
}
