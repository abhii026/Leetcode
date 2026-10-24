class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int d1=convertInt(date1);
        int d2=convertInt(date2);
        return Math.abs(d1-d2);
    }
    static int convertInt(String date){
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int total=day;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i=1971; i<year; i++){
            if((i%400==0) || (i%4==0 && i%100!=0)){
                total+=366;
            }
            else{
                total+=365;
            }
            
        }
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            days[1] = 29;
        }
        for(int i=0; i<month-1; i++){
            total+=days[i];
        }
        return total;
    }
}