class Solution {
    public String reformatDate(String date) {
        String[] parts=date.split(" ");
        String day = parts[0].substring(0, parts[0].length() - 2);
        String month=parts[1];
        String year=parts[2];
        if(day.length()==1){
            day="0"+day;
        }
        String m=monN(month);
        return year+"-"+m+"-"+day;
    }
    static String monN(String month){
        String monNum="";
        switch(month){
            case "Jan":
                monNum="01";
                break;
            case "Feb":
                monNum="02";
                break;
            case "Mar":
                monNum="03";
                break;
            case "Apr":
                monNum="04";
                break;
            case "May":
                monNum="05";
                break;
            case "Jun":
                monNum="06";
                break;
            case "Jul":
                monNum="07";
                break;
            case "Aug":
                monNum="08";
                break;
            case "Sep":
                monNum="09";
                break;
            case "Oct":
                monNum="10";
                break;
            case "Nov":
                monNum="11";
                break;
            case "Dec":
                monNum="12";
                break;
        }
        return monNum;
    }
}
