class Solution {
    public String largestOddNumber(String num) {
        int l=num.length();
        for(int i=l-1;i>=0;i--)
            
        {
            char ch=num.charAt(i);
            int c=Character.getNumericValue(ch);
            if(c%2!=0)
            {
                return num.substring(0,i+1);
            }
        }
        return "";
        
    }
}