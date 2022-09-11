class Solution {
    public boolean rotateString(String s, String goal) {
        int l=s.length();
        if(s.equals(goal))
        {
            return true;
        }
        String p=s;
        for(int i=0;i<l;i++)
        {
            
            //System.out.println(p);
            String sp="";
           sp=p.substring(1,l)+p.substring(0,1);
          
            if(sp.equals(goal))
            {
                return true;
            }
            p=sp;
            System.out.println(p);
        }
        return false;
    }
}