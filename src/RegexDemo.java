import java.util.regex.*;


public class RegexDemo {

	public static void main(String[] args) {
		int count=0;
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abbbabbaba");
		while(m.find()){
			count++;
			System.out.println(m.start()+"      "+m.end()+"      "+m.group());
		}
		System.out.println("Number Occurences are   "+count);
		System.out.println("/**************************************/");
		Pattern p1=Pattern.compile("[a-z]");
		Matcher m1=p1.matcher("a1b7@z#");
		while(m1.find()){
			System.out.println(m1.start()+"      "+m1.group());
		}
		System.out.println("/**************************************/");
		Pattern p2=Pattern.compile("Th",Pattern.CASE_INSENSITIVE);
		Matcher m2=p2.matcher("This is an apple.TH These are 33 (thirty-three) apples");
		while(m2.find()){
			System.out.println(m2.start()+"      "+m2.group());
		}
		
		System.out.println("/**************************************/");
		Pattern p3=Pattern.compile("apple",Pattern.CASE_INSENSITIVE);
		Matcher m3=p3.matcher("This is an apple.TH These APPle are 33appLE (thirty-three) apples");
		String input1=m3.replaceAll("Orange");
		System.out.println(" "+input1);
		System.out.println("/**************************************/");
		String input = "One:two:three:four";
	      String regexe = "(.+):(.+):(.+):(.+)"; // pattern to be matched
	      String replacement = "$4-$3-$2-$1";    // replacement pattern with back references
	   
	      // Step 1: Allocate a Pattern object to compile a regexe
	      Pattern pattern = Pattern.compile(regexe, Pattern.CASE_INSENSITIVE);
	   
	      // Step 2: Allocate a Matcher object from the Pattern, and provide the input
	      Matcher matcher = pattern.matcher(input);
	   
	      // Step 3: Perform the matching and process the matching result
	      String output = matcher.replaceAll(replacement);     // all matches
	      //String output = matcher.replaceFirst(replacement); // first match only
	      System.out.println(output);
		
	}

}
