class Solution {
    public int maxDistance(String moves) {
        int xcord=0,ycord=0,c_count=0;
        char[] moves1 = moves.toCharArray();
        for(char c:moves1){
            if(c=='U') ycord+=1;
            else if(c=='D') ycord-=1;
            else if(c=='L') xcord-=1;
            else if(c=='R') xcord+=1;
            else{
              c_count++;
            }
        }
          if(Math.abs(xcord)>Math.abs(ycord)){
                    if(xcord<0) xcord-=c_count;
                    else xcord+=c_count;
                }else{
                    if(ycord<0) ycord-=c_count;
                    else ycord+=c_count;
                }
        return Math.abs(xcord)+Math.abs(ycord);
    }
}