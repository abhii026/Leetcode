class Solution {
     
    int find_next(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=(d*d);
            n/=10;
        }
        return sum;
     }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=find_next(slow);
            fast=find_next(find_next(fast));
        }
        while(slow!=fast);
        return slow==1;
    }
   

}