class Solution {
    public int longestPalindrome(String s) {
        char[] c=s.toCharArray();
        int[] count=new int[128];
        for(char ch:c){
            count[ch]++;
        }
        int sum=0;
        boolean hasOdd=false;
        for(int num:count){
            if(num%2==0){
                sum+=num;
            } else {
                sum+=num-1;
                hasOdd=true;
            }
        }
        if(hasOdd)
            return sum+1;
        
        else {
            return sum;
        }
        
        
    }
}