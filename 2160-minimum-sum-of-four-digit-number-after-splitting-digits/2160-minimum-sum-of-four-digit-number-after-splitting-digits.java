class Solution {
    public int minimumSum(int num) {
        int min1=9,min2=9;
        int max1=0,max2=0;
        while(num>0){
            int d=num%10;
            if(d<=min1){
                min2=min1;
                min1=d;
            }
            else if(d<min2){
                min2=d;
            }

             if(d>=max1){
                max2=max1;
                max1=d;
            }
            else if(d>max2){
                max2=d;
            }
            num=num/10;
        }
        int num1=min1*10+max1;
        int num2=min2*10+max2;
        return num1+num2;
    }
}