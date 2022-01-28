import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        int[] aFreq = new int[26];
        int[] bFreq = new int[26];
                
        for(int i=0;i<a.length();i++){
            int index = Character.toLowerCase(a.charAt(i))-'a';
            aFreq[index]+=1;
        }
        
        for(int i=0;i<b.length();i++){
            int index = Character.toLowerCase(b.charAt(i))-'a';
            bFreq[index]+=1;
        }
        
        for(int i=0;i<26;i++){
            if(aFreq[i]!=bFreq[i]){
                return false;
            }
        }
        
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
