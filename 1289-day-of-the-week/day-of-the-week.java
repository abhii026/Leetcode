class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] week = {"Sunday", "Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday"};
        int d=totald(day,month,year)%7;
        int res =(d+5)%7;
        return week[res];
        

    }
    static int totald(int day,int month, int year){
        int[] days={31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31};
        int total=day-1;
        for(int i= 1971; i<year; i++){
            if((i%400==0) || (i%4==0 && i%100!=0)){
                total+=366;
            }
            else{
                total+=365;
            }
        }
        if((year%400==0) || (year%4==0 && year%100!=0)){
            days[1]=29;
        }
        for(int i=0; i<month-1; i++){
            total+=days[i];
        }
        return total;
    }
}