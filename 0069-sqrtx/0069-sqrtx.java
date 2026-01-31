class Solution {
    public int mySqrt(int x) {
        for(int i=1;i<=x/2+1;i++){
            
                long sq=(long)i*i;
                 if(sq==x)
                return i;
            else if(sq>x){
                return i-1;
            }
        }
        return 0;
    }
}