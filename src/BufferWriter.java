import java.io.*;


public class BufferWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("FileWriterDemo.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Buffered Writer    \n12255555   \nhghggg  9888");
		bw.newLine();
		char[] cbuf={'a','b','c','d','e'};
		bw.write(cbuf);
		bw.write(100);
		bw.flush();
		bw.close();
		
		FileReader fr=new FileReader("FileWriterDemo.txt");
		BufferedReader br=new BufferedReader(fr);
		String l=br.readLine();
		while(l!=null)
		{
			System.out.println(l);
			l=br.readLine();
		}
	}
;
}
