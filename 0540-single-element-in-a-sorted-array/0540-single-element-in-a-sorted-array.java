class Solution {
    public int singleNonDuplicate(int[] a) {
        int l=0,h=a.length-1;
    while(l<h){
    int m=l+(h-l)/2;
    if(m%2==1)m--;
    if(a[m]==a[m+1])l=m+2;
    else h=m;
}
return a[l];
}
}