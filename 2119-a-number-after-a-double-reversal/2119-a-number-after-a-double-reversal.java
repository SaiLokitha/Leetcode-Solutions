class Solution {
    public boolean isSameAfterReversals(int num) {
        int n=0;
        if(num==0) return true;
            n=num%10;
            if(n==0){
                return false;
            }
            else {
                return true;
            }

        
    }
}