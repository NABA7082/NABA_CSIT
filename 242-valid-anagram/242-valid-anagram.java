class Solution {
    public boolean isAnagram(String s, String t) {
                char[] st = s.toCharArray();
        char[] tt = t.toCharArray();

        Arrays.sort(st);
        Arrays.sort(tt);
        
        if(Arrays.equals(st,tt))
        {
            return true;
        }
        else
        {
            return false;
        }
            
        
        
    }
}