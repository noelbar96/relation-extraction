import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.StringTokenizer;
public class reg2 {
	
	public static void main(String args[]){
		
		String line="(ROOT(S(NP(NP (NNS Cats))(, ,)(NP (NNS cows))(, ,)(NP (NNS dogs))(CC and)(NP (JJ other) (NNS animals)))(VP (MD can) (VP (VB be) (VP (VBN domesticated))))(. .)))";
		line=line.toLowerCase();
		
		String pattern="(.*?)(\\(nnp |\\(nns )(.*?)( and\\))(.*?)( other\\))(.*)";
		
		Pattern p= Pattern.compile(pattern);
		
		Matcher m=p.matcher(line);
		
		if(m.find()){
			System.out.println("1: "+m.group(1));
			System.out.println("2: "+m.group(2));
			System.out.println("3: "+m.group(3));
			System.out.println("4: "+m.group(4));
			System.out.println("5: "+m.group(5));
			System.out.println("6: "+m.group(6));
			System.out.println("7: "+m.group(7));
			
			
		}
		else
			System.out.println("No Match.");
	}

}
