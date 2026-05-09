public class NextDayCalculartor {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }

    public static String getNextDay(int day, int month, int year) {
        int lastDayOfMonth = getDaysInMonth(month, year);

        if (day < lastDayOfMonth) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }
        return day + "/" + month + "/" + year;
    }

    public static void main(String[] args) {
        System.out.println("Ngày tiếp theo của 9/5/2026 là: " + getNextDay(9, 5, 2026));
        System.out.println("Ngày tiếp theo của 10/5/2026 là: " + getNextDay(10, 5, 2026));
    }
}