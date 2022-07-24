class MedianFinder {
    PriorityQueue<Integer>min=new PriorityQueue<Integer>();
     PriorityQueue<Integer>max=new PriorityQueue<Integer>(Collections.reverseOrder());
        

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        
        int l=max.size();
        int r=min.size();
        
        if(l==0)
        {
            max.add(num);
        }
        else if(l==r)
        {
            if(num>min.peek())
            {
                int t=min.peek();
                min.poll();
                max.add(t);
                min.add(num);
            }
            else
            {
                max.add(num);
            }
            
        }
        else
        {
            if(r==0)
            {
                if(num<max.peek())
                {
                    int t=max.peek();
                    max.poll();
                    min.add(t);
                    max.add(num);
                }
                else
                {
                    min.add(num);
                }
            }
            else if(num>=min.peek())
            {
                min.add(num);
            }
            else
            {
                if(num>max.peek())
                {
                 min.add(num);   
                }
                else
                {
                    int t=max.peek();
                    max.poll();
                    max.add(num);
                    min.add(t);
                }
            }
        }
        
        
        
        
    }
    
    public double findMedian() {
        int l=max.size();
        int r=min.size();
        
        if(l>r)
        {
            double d=max.peek();
            return d;
        }
        else
        {
           double ma=max.peek();
            double mi=min.peek();
                double d=(ma+mi)/2;
            return d;
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */