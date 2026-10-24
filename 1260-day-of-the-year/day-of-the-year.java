class Solution {
    public int dayOfYear(String date) {
        int res=convertInt(date);
        return res;
    }
    static int convertInt(String date){
        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8,10));
        int total=day;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if((year%400==0)||(year%4==0 && year%100!=0)){
            days[1]=29;
        }
        for(int i=0; i<month-1; i++){
            total+=days[i];
        }
        return total;
    }
}