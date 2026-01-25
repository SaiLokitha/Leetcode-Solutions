class Solution {
    public int alternateDigitSum(int n) {
        boolean flag=false;
        int sum=0,count=0;
        int N=n;
        while(n!=0){
            int d=n%10;
            count++;
            n=n/10;
        }
        if(count%2==0){
            while(N!=0){
               int d=N%10;
               if(flag==false){
                flag=true;
               }
               else flag=false;
                if(flag==true){
                    sum-=d;
                }
                else{
                    sum+=d;
                }
                N=N/10;
            }
        }
        if(count%2!=0){
            while(N!=0){
               int d=N%10;
               if(flag==false){
                flag=true;
               }
               else flag=false;
                if(flag==true){
                    sum+=d;
                }
                else{
                    sum-=d;
                }
                N=N/10;
            }
            
        }
        return sum;
        
    }
}