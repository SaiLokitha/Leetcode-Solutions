class Solution {
    public int reverse(int x) {
        boolean flag=false;
        int rev=0;
        if(x<0){
            x=x*-1;
            flag=true;
        }
        while(x>0){
            int rem=x%10;

            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && rem>7)){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && rem<-8)){
                return 0;
            }
            rev=rev*10+rem;
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE){
            return 0;
        }
        if(flag==true){
            rev=rev*-1;
            return rev;
        }
        return rev;
    }
}