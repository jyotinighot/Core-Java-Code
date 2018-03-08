/************************  Instantiate Interface using Anonymous inner Class ************************/
//Java program to demonstrate Anonymous inner class
interface Age
{
    int x = 21;
    void getAge();
}
abstract class Demo{
	abstract void getDisplay(String s);
}
class AnonymousDemo
{
	static int temp=10;
    public static void main(String[] args) {
 
        // Myclass is hidden inner class of Age interface
        // whose name is not written but an object to it 
        // is created.
        Age oj1 = new Age() {
            @Override
            public void getAge() {
                 // printing  age
                System.out.print("Age is "+x+" "+temp);
            }
        };
        oj1.getAge();
        
        Demo d1=new Demo(){
        	public void getDisplay(String s){
        		System.out.println("\nImplementation of Anonymous inner clas for Abstract class instantiation "+s);
        	}
        };
        d1.getDisplay("call Method");
    }
}



/************************  Instantiate Interface using Anonymous inner Class ************************/