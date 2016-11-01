import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.StringTokenizer;
public class RegexMatches {

   public static void main( String args[] ) {
      // String to be scanned to find the pattern.
      String line = "(ROOT (S (NP (PRP She)) (VP (VBZ grows) (NP (JJ such) (NNS flowers)) (PP (IN as) (NP (NNS tulips) (, ,) (NNS pansies)(CC and) (NNS daisies))))(. .)))";
      line=line.toLowerCase();
      
      String pattern = "(.*)(such\\))(.+)( as\\))(.*)(and\\)|or\\))(.*?)(nnp|nns )(.*)";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
     
      
      if (m.find( )) {
    	  
           //System.out.println("Found value: " + m.group(0) );
           System.out.println("Found value: " + m.group(1) );
           System.out.println("Found value: " + m.group(2) );
           System.out.println("Found value: " + m.group(3) );
           System.out.println("Found value: " + m.group(4) );
           System.out.println("Found value: " + m.group(5) );
           System.out.println("Found value: " + m.group(6) );
           System.out.println("Found value: " + m.group(7) );
           System.out.println("Found value: " + m.group(8) );
           System.out.println("Found value: " + m.group(9) );
           
           String s2, str="";
           String s1=m.group(3);
           StringTokenizer st1=new StringTokenizer(s1,"() ,.");
           while(st1.hasMoreTokens())
           {
        	   s2=st1.nextToken();
        	   if(s2.equals("jj"))
        		   str=st1.nextToken();
        	   else if(s2.equals("nns")||s2.equals("nnp"))
        		   str=str+" "+st1.nextToken();
        	   
        	   if(str.charAt(str.length()-1)=='s')
        		   str=str.substring(0,str.length()-1);
           }
           String s3=m.group(5),s4;String str1[]=new String[10]; int k=0;
           StringTokenizer st2=new StringTokenizer(s3,"() .,");
        	while(st2.hasMoreTokens())
        	{
        		s4=st2.nextToken();
        		//System.out.println(s4);
        		if(s4.equals("nnp")||s4.equals("nns"))
        		{
        			str1[k]=st2.nextToken();
        			if(str1[k].charAt(str1[k].length()-1)=='s')
        				str1[k]=str1[k].substring(0,str1[k].length()-1);
        			k++;
        		}
        	}
        	
        	String s5=m.group(9), s6;StringTokenizer st3=new StringTokenizer(s5,"() ,.");
        	s6=st3.nextToken();
        	str1[k]=s6;k++;
        	for(int i=0;i<k;i++)
        	{
        		System.out.println("hyponym("+str+", "+str1[i]+")");
        	}
        	
        	   
           }
         
      
      else {
         System.out.println("NO MATCH");
      }
   }
}