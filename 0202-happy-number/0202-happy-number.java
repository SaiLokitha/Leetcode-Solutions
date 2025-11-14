class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(n>=9){
        while(n!=0){
            int l=n%10;
            sum=sum+(l*l);
            n=n/10;
        }
        n=sum;
        sum=0;
        }
        if(n==1 || n==7)
        return true;
        else 
        return false;
        
    }
}