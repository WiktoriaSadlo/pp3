public class MyCalendar {
    static int year = 2019;
    static int month = 6;
    static int day = 26;

    static String myDate() {
        return year + "-" + month + "-" + day;
    }

    static int daysFromBeg() {
        int beginning = 0;
        switch (month) {
            case 1:
                beginning+=day;
                return beginning;
            case 2:
                return beginning = day + 31;
            case 3:
                return beginning = day + 31 + 28;
            case 4:
                return beginning = day + 31 + 28 + 31;
            case 5:
                return beginning = day + 31 + 28 + 31 + 30;
            case 6:
                return beginning = day + 31 + 28 + 31 + 30 + 31;
            case 7:
                return beginning = day + 31 + 28 + 31 + 30 + 31 + 30;
            case 8:
                return beginning = day + 31 + 28 + 31 + 30 + 31 + 30 + 31;
            case 9:
                return beginning = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
            case 10:
                return beginning = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
            case 11:
                return beginning = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
            case 12:
                return beginning = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
            default:
                return 0;
        }
        
    }

    static String monthName() {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "SSeptember";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";

        }

        return "";
    }
}
