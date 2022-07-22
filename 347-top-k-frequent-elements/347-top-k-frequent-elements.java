class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        //PriorityQueue<Pair<Integer,Integer>>pq=new PriorityQueue<Pair<Integer,Integer>>();
        PriorityQueue<Pair<Integer,Integer> > pq=new PriorityQueue<Pair<Integer,Integer>>((a,b) -> a.getKey() - b.getKey());
         
        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i]))
            {
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else
            {
                mp.put(nums[i],1);
            }
        }
        
        for (Map.Entry<Integer,Integer> mapElement :mp.entrySet()) 
        {
            int key=mapElement.getValue();
            int v=mapElement.getKey();
            
            pq.add(new Pair<>(key,v));
            
            if(pq.size()>k)
            {
                pq.poll();
            }
            
            }
        int ar[]=new int[k];
        int u;
        int j=0;
        for(int i=pq.size()-1;i>=0;i--)
        {
            ar[i]=pq.remove().getValue();
            
            
            //pq.poll();
            
                
            
        }
        return ar;
    }
}