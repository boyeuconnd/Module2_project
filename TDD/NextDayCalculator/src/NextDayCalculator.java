public class NextDayCalculator {
    final static int FIRST_DAY_OF_MONTH =1;
    final static int FIRST_MONTH_OF_YEAR =1;
    final static int LAST_MONTH_OF_YEAR =12;
    public static boolean isJumpNextMonth = false;
    public static boolean isJumpNextYear = false;
    public static int[] Day = new int[3];
    public static void setDay(int day){
        Day[0] = day;
    }
    public static void setMonth(int month){
        Day[1] = month;
    }
    public static void  setYear(int year){
        Day[2] = year;
    }
    public static int nextDayCal(){

        int daysInMonth = getDaysOfMonth(Day[1]);
        int day = Day[0];
        if(day == daysInMonth){
            isJumpNextMonth =true;
            return FIRST_DAY_OF_MONTH;
        }else {
            day++;
            return day;
        }

    }
    public static int nextMonthCal(){
        int month = Day[1];
        if(isJumpNextMonth){
            isJumpNextMonth = false;
            if(month == LAST_MONTH_OF_YEAR ){
                isJumpNextYear = true;
                return FIRST_MONTH_OF_YEAR;
            }else {
                month++;
                return month;
            }
        }else {
            return month;
        }

    }
    public static int nextYearCal(){
        int year = Day[2];
        if(isJumpNextYear){
            isJumpNextYear =false;
            year++;
            return year;
        }else {
            return year;
        }

    }
    public static int getDaysOfMonth (int months){
        switch (months){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(isLeapYear(Day[2])){
                    return 29;
                }else {
                    return 28;
                }

            default:
                return 0;
        }

    }
    public static boolean isLeapYear(int year){
        boolean isLeapYear = false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0) isLeapYear =true;
            }else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }




}
