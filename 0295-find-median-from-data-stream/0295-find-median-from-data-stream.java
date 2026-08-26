class MedianFinder {
    double cm=(double)0;
    PriorityQueue<Integer> minh;
    PriorityQueue<Integer> maxh;
    public MedianFinder() {
       minh = new PriorityQueue<>();
        maxh = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(num>cm){
            minh.add(num);
            if(minh.size()-maxh.size()>1) maxh.add(minh.remove());
        }else{
            maxh.add(num);
            if(maxh.size()-minh.size()>1) minh.add(maxh.remove());
        }
           if(maxh.size()==minh.size()){
            cm = ((double)maxh.peek()+minh.peek())/(double)2;
          
        }else{
            if(maxh.size()>minh.size()){
                cm = (double)maxh.peek();
            }else{
                cm = (double)minh.peek();
                
            }
       
        }
    }
    
    public double findMedian() {
     return cm;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */