class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for(int i=0; i<s.length(); i++){
            int ch=s.charAt(i)-'a'+1;
            while(ch>0){
                sum+=ch%10;
                ch=ch/10;
            }
        }
        while(k-1>0){
            int temp=sum;
            sum=0;
            while(temp>0){
                sum+=temp%10;
                temp=temp/10;
            }
            k--;
        }
        return sum;
    }
}