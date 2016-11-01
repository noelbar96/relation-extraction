import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.StringTokenizer;
public class reg1 {
	
	public static void main(String args[]){
		
		String line="(ROOT(S(NP(NP(NNS Governments))(PP (IN of)(NP(ADJP (RBS most) (JJ European))(NNPS Countries))))(, ,)(PP (RB especially)(NP (NNP France) (, ,) (NNP England)(CC and)(NNP Spain)))(, ,)(VP (VBP do) (RB not)(VP (VB allow)(NP (NNS refugees))))(. .)))";
		line=line.toLowerCase();
		
		String pattern="(.*?)(especially\\))(.*)(and\\)|or\\))(.* )";
		
		Pattern p= Pattern.compile(pattern);
		
		Matcher m=p.matcher(line);
		
		if(m.find()){
			System.out.println("1: "+m.group(1));
			System.out.println("2: "+m.group(2));
			System.out.println("3: "+m.group(3));
			System.out.println("4: "+m.group(4));
			System.out.println("5: "+m.group(5));
			//System.out.println("6: "+m.group(6));
		}
		else
			System.out.println("No Match.");
	}

}
