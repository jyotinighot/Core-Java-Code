import java.io.*;
import java.util.*;
public class DuplicateArrayElementRemoval {

	public static void main(String[] args) {
		/*  http://www.instanceofjava.com/p/collections-interview-questions.html
///////////////////   Remove Duplicate Array Elements
		int[] a={1,2,9,6,4,6,2,9,5,4,7,1,3};
		Set hashset=new HashSet();
		for (int i : a) {
			hashset.add(i);
		}
		System.out.println(hashset);


		String a1[] = new String[]{"abc","klm","xyz","pqr","abc","xyz"};
	      List list1 = Arrays.asList(a1);
	      System.out.println("The list is:" + list1);


	      Integer[] x={1,2,3,4,1,2,3,4,5,6,7,3,4,5};
	      List list2 = Arrays.asList(x);
	      Set hashset1=new HashSet(list2);
	      System.out.println("Hashset    "+hashset1);

	      List list11 = new ArrayList();
	      for (int i : a) {
				list11.add(i);
			}
	     Set hashset11=new HashSet(list11);
			System.out.println(hashset11);
		 */
		/////////////////////////////// Second Highest Element with sorting
		/*Integer[] a={5,434,88,22,99,44,333};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println((a[(a.length)-2]));

		int []aa={5,434,88,22,99,44,333};
		   List list11 = new ArrayList();
		      for (int i : aa) {
					list11.add(i);
				}
		Collections.sort(list11);
		System.out.println(list11.get(list11.size()-2));
		System.out.println(list11.get(list11.indexOf(Collections.max(list11))-1));
///////////////////// Without Sorting Second Highest Element
		Integer[] arr={5,434,88,22,99,44,333};
		Set tset=new TreeSet();
		for (int i : arr) {
			tset.add(i);
		}
		System.out.println(tset);
		ArrayList l=new ArrayList(tset);
		System.out.println(l.get(l.size()-2));
		 */
		//////////////////////////// Circular String // Rotational String
		String s1=	"tackoverflows";
		String s2="ackoverflowst";
		String s3="overflowstack";
		if(s3.length()==s2.length()){
			if((s3+s2).contains(s2)){

				System.out.println("Circulat Rotational String");
			}

		}
		/////////////////////////// Extract Digit From STring and sum
		/*String s5="1ss3fgg5";
		String n=s5.replaceAll("[^0-9]", "");
		System.out.println(n);
		int n1=Integer.parseInt(n.trim());
		System.out.println(n1);
		int sum=0;
		while(n1>0)
		{
			sum=sum+(n1%10);
			n1=n1/10;
		}
		System.out.println(sum);*/
		/////////// {1,2,4,26,5,3,2}  o/p- [2,4,5,3,26,4] value of list considered as index then get respective element
		/*	int[] aa={4,1,2,8,54,3,9,6,7};
		ArrayList l2=new ArrayList();
		for (int i : aa) {
			l2.add(i);
		}
		for (Object object : l2) {
			if((int)object<(l2.size())){
				System.out.print("\t"+l2.get((int) object));
			}
		}*/
		/////////////////////////// Remove Specific Element not using Index////////
		/*int[] aa={9,1,4,8,54,3,9,6,7};
		ArrayList l2=new ArrayList();
		for (int i : aa) {
			l2.add(i);
		}
		System.out.println(l2);
		l2.remove((Integer)3);
		System.out.println(l2);*/
		////////////////////  Check if Element is present in Hashset
		/*HashSet hset=new HashSet();
		for (int i : aa) {
			hset.add(i);
		}
		System.out.println("Hashset= "+hset);
		if(hset.contains(54)){
			System.out.println("PRESENT");
		}else{
			System.out.println("NOT PRESENT");
		}*/
		///////////////// Common Elements Between Two Array////////////////
		/*	int[] ar={3,6,7,1,34,78,90};
		HashSet hset1=new HashSet();
		for (int i : ar) {
			hset1.add(i);
		}
		System.out.println(hset1);
		hset.retainAll(hset1);
		System.out.println(hset);*/
		///////////////////////// Reverse an Array ////////////////
		/*	int[] ar={3,6,7,1,34,78,90};
		ArrayList list=new ArrayList();
		for (int i : ar) {
			list.add(i);
		}
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		 *//////////////////////////// Treeset to Array //////////
		/*TreeSet t=new TreeSet();
		t.add(1);
		t.add(92);
		t.add(3);
		t.add(54);
		t.add(5);
		t.add(64);
		t.add(8);
		Integer[] az=new Integer[10];
		t.toArray(az);
		System.out.println(Arrays.toString(az));
		System.out.println(Collections.max(t));
		System.out.println(Collections.min(t));
		t.remove((Integer) 4);
		System.out.println(t);*/
		/////////////// List in Descending Order/////////////
		/*int[] ar={33,6,7,6,1,34,78,6,90};
		ArrayList list=new ArrayList();
		for (int i : ar) {
			list.add(i);
		}
		System.out.println("Original  "+list);
		Comparator comparator = Collections.reverseOrder();
		 Collections.sort(list, comparator);
		System.out.println("Reverse "+list);
		list.clear();
		System.out.println("Reverse "+list);*/
////////////////////////////// Count Nunber of Words, Characters, Lines from a file /////////
		BufferedReader reader = null;
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		try
		{
			reader = new BufferedReader(new FileReader("E:\\sample.txt"));
			String currentLine = reader.readLine();
			while (currentLine != null)
			{
				lineCount++;
				String[] words = currentLine.split(" ");
				wordCount = wordCount + words.length;
				for (String word : words)
				{
					charCount = charCount + word.length();
				}
				currentLine = reader.readLine();
			}
			System.out.println("Number Of Chars In A File : "+charCount);
			System.out.println("Number Of Words In A File : "+wordCount);
			System.out.println("Number Of Lines In A File : "+lineCount);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				reader.close();           //Closing the reader
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}    
	//////////////***********Conut the Frequency of each Word Logic /////////////////////	
	/*public Map<String, Integer> getWordCount(String fileName){
        FileInputStream fis = null;
        DataInputStream dis = null;
        BufferedReader br = null;
        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        try {
            fis = new FileInputStream(fileName);
            dis = new DataInputStream(fis);
            br = new BufferedReader(new InputStreamReader(dis));
            String line = null;
            while((line = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line, " ");
                while(st.hasMoreTokens()){
                    String tmp = st.nextToken().toLowerCase();
                    if(wordMap.containsKey(tmp)){
                        wordMap.put(tmp, wordMap.get(tmp)+1);
                    } else {
                        wordMap.put(tmp, 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{if(br != null) br.close();}catch(Exception ex){}
        }
        return wordMap;*/
	//////////////////////////////////////////////////////////////



}

