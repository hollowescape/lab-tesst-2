import java.util.*;
import numbercheck.ncheck;
public class test9{
	static void check(String s) throws ncheck{
		int i;
		if(s.length()==11)
		{
			char[] ch = new char[s.length()];
			for( i=0;i<s.length();i++)
			{
				ch[i]=s.charAt(i);
			}
			for(i=0;i<2;i++){ 		
			if ((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122)) 
            
		}
	}
}