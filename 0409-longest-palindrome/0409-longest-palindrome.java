class Solution {
    public int longestPalindrome(String s) {
        char[] c=s.toCharArray();
        HashMap<Character,Integer> Map=new HashMap<>();
        for(char ch:c){
            Map.put(ch,Map.getOrDefault(ch,0)+1);
        }
        int sum=0;
        boolean hasOdd=false;
        for(int count:Map.values()){
            if(count%2==0){
                sum+=count;
            } else {
                sum+=count-1;
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