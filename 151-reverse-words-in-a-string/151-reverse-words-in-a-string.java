import java.util.*;
import java.io.*;
class Solution {
    public String reverseWords(String s) {
        String result="";
        StringTokenizer s1=new StringTokenizer(s);
        
        while(s1.hasMoreTokens())
        {
            result=s1.nextToken()+" "+result;
            
        }
        return result.trim();
        
        
        
        
    }
}