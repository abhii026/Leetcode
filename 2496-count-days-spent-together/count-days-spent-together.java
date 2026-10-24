class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        String start;
        if(arriveAlice.compareTo(arriveBob)<0){
            start=arriveBob;
        }
        else{
            start=arriveAlice;
        }
        String dep;
        if(leaveAlice.compareTo(leaveBob)<0){
            dep=leaveAlice;
        }
        else{
            dep=leaveBob;
        }
        if(start.compareTo(dep)>0){
            return 0;
        }
        else if(start.compareTo(dep)==0){
            return 1;
        }
        int startday=convertInt(start,days);
        int endday=convertInt(dep,days);
        int res=endday-startday+1;
        return res;
        
    }
    static int convertInt(String date,int[] d){
       int month = Integer.parseInt(date.substring(0, 2));
       int day = Integer.parseInt(date.substring(3, 5));
       int total =day;
       for(int i=0; i<month-1; i++){
        total+=d[i];
       }
       return total;
    }
}