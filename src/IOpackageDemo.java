import java.io.*;
public class IOpackageDemo {
	
	
	public static void main(String[] args) throws IOException {
		File f=new File("File3.txt");
		if(f.createNewFile())
		{
			System.out.println(f+" File Created");
		}
		else System.out.println("File.txt already available");
		File f1=new File("Jyoti Directory Demo");
		if(f1.mkdir())
			System.out.println("File Created");
		else System.out.println("Direcory Jyoti Directory Demo already available");
		f1=new File("Jyoti Directory Demo","File1.txt");
		if(f1.createNewFile())
			System.out.println("File Created");
		else
			System.out.println("File1.txt already available");
		f=new File("c://Demo");
		String[] s=f.list();
		int r=0;int fl=0;
		for (String string : s) {
				File f2=new File(f,string);
				if(f2.isFile())
						fl++;
				else if(f2.isDirectory())
					r++;
		}
		System.out.println("Number of files are "+fl+"   \n Number of Directories are "+r);
		FileWriter fw=new FileWriter("File.txt");
		fw.write("Demo SCJP ");
		//fw.write('\n');
		char[] c={'j','a','v','a'};
		fw.write(c);
		fw.flush();
		fw.close();
		FileReader fr=new FileReader("File.txt");
		int i=fr.read();
		while(i!=-1){
			System.out.print((char)i);
			i=fr.read();
		}
	}
}
