class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
                char[] st = s.toCharArray();
        char[] tt = t.toCharArray();

        Arrays.sort(st);
        Arrays.sort(tt);
        
        //if(Arrays.equals(st,tt))
        
       for(int i=0;i<st.length;i++)
       {
            
        /*{
            return true;
        }
        else
        {
            return false;
        }*/
            if(st[i]!=tt[i])
            {
                return false;
            }
    
            
        
        
    }
    return true;
}
}