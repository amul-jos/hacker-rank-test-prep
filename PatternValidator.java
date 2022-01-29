import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        int i = 1;
		while(i<=testCases){
			String pattern = in.nextLine();
            i++;
          	try{
                if( Pattern.compile(pattern,0)!=null){
                    System.out.println("Valid") ;
                }
              }
              catch(PatternSyntaxException e){
                 System.out.println("Invalid") ;
              }
		}
	}
}



