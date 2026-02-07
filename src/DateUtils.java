import java.time.LocalDate;
import java.time.Period;

public class DateUtils {
        // метод выявления високосного года
    public static boolean isLeapYear(int year) {
        if (((year % 4) == 0) && (year % 100 != 0) || ((year % 400) == 0)) {
            return true;
        } else {
            return false;
        }

    }

        // метод вычисления кода месяца
    public static int monthCode(int month, int year) {
        if (DateUtils.isLeapYear(year)) {      // ветвление если год високосный
            if (month == 1 || month == 4) {
                return 0;
            }
            if (month == 2 || month == 8) {
                return 3;
            }
            if (month == 3 || month == 11) {
                return 4;
            }
            if (month == 5) {
                return 2;
            }
            if (month == 6) {
                return 5;
            }
            if (month == 9 || month == 12 || month == 7) {
                return 6;
            }
            if (month == 10) {
                return 1;
            }

        } else {
            if (month == 1 || month == 10) { // ветвление если год обычный
                return 1;
            }
            if (month == 2 || month == 3 || month == 11){
                return 4;
            }
            if (month == 4 || month == 7){
                return 0;
            }
            if (month == 5){
                return 2;
            }
            if (month == 6){
                return 5;
            }
            if (month == 8){
                return 3;
            }
            if (month == 9 || month == 12){
                return 6;
            }
        }
        return -1; // заглушка на случай, если месяц введен не правильно
    }


    // метод вычисления кода года
    // работает только с 20-21 веками

    public static int yearCode (int year){
        int yearNumber = 0;
        if ((year >= 2001) && (year < 2101)){
            yearNumber = 6;
        }
        else if ((year >= 1901) && (year < 2001)) {
            yearNumber = 0;
        }
        int xx = year % 100;
        int yearCode = (yearNumber + xx + xx / 4) % 7;
        return yearCode;
    }

    // метод вычисления дня недели

    public static String weekDay(int day, int monthCode, int yearCode){
        String week = "";
        int weekCode = (day + monthCode + yearCode - 1) % 7;
        if (weekCode < 0) weekCode += 7; // защита от отрицательного остатка

        if (weekCode == 0) week = "Воскресенье";
        if (weekCode == 1) week = "Понедельник";
        if (weekCode == 2) week = "Вторник";
        if (weekCode == 3) week = "Среда";
        if (weekCode == 4) week = "Четверг";
        if (weekCode == 5) week = "Пятница";
        if (weekCode == 6) week = "Суббота";

        return week;
    }

    // метод вычисления возраста

    public static int yearsOld(int day, int month, int year){
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        Period period = Period.between(birthDate, today);
        return period.getYears();
    }
}






