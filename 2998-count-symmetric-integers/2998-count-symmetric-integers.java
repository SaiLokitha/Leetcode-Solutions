class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int rsum=0,lsum=0,count=0;
        String Rs="";
        String Ls="";
        int i=low,len=0;        
        while(i<=high)
        {
            String str=String.valueOf(i);
           len=str.length();
           if(len%2==0)
           {
             Rs=str.substring(0,len/2);
             Ls=str.substring(len/2);
             rsum=Integer.parseInt(Rs);
             lsum=Integer.parseInt(Ls);
             if(digitSum(rsum)==digitSum(lsum))
             {
                count++;
             }
           } 
           i++;   
        }
     
        return count;
    }
        public static int digitSum(int num){
            int sum=0;
            while(num!=0){
                int temp=num%10;
                sum=sum+temp;
                num/=10;
            }
            return sum;
        }
}