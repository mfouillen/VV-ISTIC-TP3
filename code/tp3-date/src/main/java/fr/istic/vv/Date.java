package fr.istic.vv;

class Date implements Comparable<Date> {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) { 
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static boolean isValidDate(int day, int month, int year) {
        if (day <= 0){
            return false;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return day <= 31;
            case 2:
                return (isLeapYear(year) ? day <= 29 : day <= 28);
            case 4:
            case 6:
            case 9:
                return day <= 30;
            default:
                return false;
        }
    }

    public static boolean isLeapYear(int year) { 
        return ((year%4 == 0 && year%100 == 0) || year%400 == 0);
    }

    public Date nextDate() { 
        if(isValidDate(this.day+1, this.month, this.year)){
            return new Date(this.day+1, this.month, this.year);
        }
        else if(isValidDate(this.day, this.month+1, this.year)) {
            return new Date(this.day, this.month+1, this.year);
        }
        else {
            return new Date(this.day, this.month, this.year+1);
        }
     }

    public Date previousDate() {
        if(this.day != 1){
            return new Date(this.day-1, this.month, this.year);
        }
        else if(this.month != 1){
            return new Date(1, this.month-1, this.year);
        }
        else {
            return new Date(1, 1, this.year-1);
        }
    }

    public int compareTo(Date other) {

        // year comparaison
        if(this.year > other.year){
            return 1;
        }
        else if(this.year < other.year) {
            return -1;
        }

        // month comparaison
        if(this.month > other.month){
            return 1;
        }
        else if(this.month < other.month) {
            return -1;
        }

        // day comparaison
        if(this.day > other.day){
            return 1;
        }
        else if(this.day < other.day) {
            return -1;
        }

        return 0; 
    }

}