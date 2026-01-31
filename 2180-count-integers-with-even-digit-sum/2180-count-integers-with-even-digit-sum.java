class Solution {
    public int countEven(int num) {
    int count=0,sum=0,temp=0;
     for(int i=1;i<=num;i++)
     {
       temp=i; sum=0;
        while(temp!=0)
        {
            int d=temp%10;
            sum=sum+d;
            temp=temp/10;
        }
        if(sum%2==0) count++;
     }      
        return count;
    }
}