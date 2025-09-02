package org.dxc.copa.automation.util;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

import static java.time.temporal.ChronoUnit.DAYS;

public class DateUtil {
    public static final String DATEFORMATPATTERN = "M/d/yyyy";
    public static final String DATETIMEFORMATPATTERN_DDMMMYYYY_HHMM = "dd-MMM-yyyy HH:mm";

    public static LocalDate formatToLocalDate(String dateStr) {
        LocalDate actualDateLD;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATEFORMATPATTERN);
        actualDateLD = LocalDate.parse(dateStr, formatter);
        return actualDateLD;
    }

    public static LocalDateTime formatToLocalDateTime(String dateStr, String time) {
        int addDays = 0;
        if (time.contains("+")) {
            String[] timeArray = time.split("\\+");
            time = timeArray[0];
            addDays = Integer.parseInt(timeArray[1]);
        }

        LocalDateTime aLocalDateTime;
        DateTimeFormatter df = new DateTimeFormatterBuilder()
                // case insensitive to parse JAN and FEB
                .parseCaseInsensitive()
                .appendPattern(DATETIMEFORMATPATTERN_DDMMMYYYY_HHMM)
                // create formatter (use English Locale to parse month names)
                .toFormatter(Locale.ENGLISH);

        aLocalDateTime = LocalDateTime.parse(dateStr + " " + time, df);

        return aLocalDateTime.plusDays(addDays);
    }

    public static String plusDays(String actualDate, int days) {
        LocalDate actualDateLD = DateUtil.formatToLocalDate(actualDate);
        actualDateLD = actualDateLD.plusDays(days);
        return actualDateLD.format(DateTimeFormatter.ofPattern(DATEFORMATPATTERN));
    }

    public static String plusDays(LocalDate actualDate, int days) {
        actualDate = actualDate.plusDays(days);
        return actualDate.format(DateTimeFormatter.ofPattern(DATEFORMATPATTERN));
    }

    public static String plusDaysFromToday(int days) {
        LocalDate actualDateLD = LocalDate.now();
        actualDateLD = actualDateLD.plusDays(days);
        return actualDateLD.format(DateTimeFormatter.ofPattern(DATEFORMATPATTERN));
    }

    public static String formatDateToSharesDateFormat(LocalDate aDate)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMM");
        return aDate.format(dtf).toUpperCase();
    }

    public static String formatDateToISharesDateFormat(LocalDate aDate)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMMyy");
        return aDate.format(dtf).toUpperCase();
    }

    public static long getDaysUntilNext(String dayOfTheWeek, LocalDate fromDate) throws IllegalArgumentException {
        LocalDate dayOfTheWeekDate = fromDate.with(TemporalAdjusters.next(DayOfWeek.valueOf(dayOfTheWeek.toUpperCase())));
        return DAYS.between(fromDate, dayOfTheWeekDate);
    }

    public static boolean isDayOfTheWeek (String dayValue) {
        if (dayValue == null) {
            return false;
        }
        return Arrays.stream(DayOfWeek.values()).anyMatch(dayOfWeek -> dayOfWeek.toString().equals(dayValue.trim().toUpperCase()));
    }

    public static LocalDate getADateNexthMonth(int day) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, day);
        return LocalDateTime.ofInstant(cal.toInstant(), cal.getTimeZone().toZoneId()).toLocalDate();
    }

    public static LocalDate formatToLocalDateShares(String dateStr) {
        LocalDate actualDateLD;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyy");
        actualDateLD = LocalDate.parse(dateStr, formatter);
        return actualDateLD;
    }

    public static String getRandomDOB(String passengerType) {

        // Get today's date

        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime();
        // Create a Random object
        Random random = new Random();

        if (passengerType.equalsIgnoreCase("ADT")) {

            int years = 20 + random.nextInt(51); // between 20 to 70 years
            // Subtract the random number of years from today's date
            calendar.add(Calendar.YEAR, -years);
            // Generate a random number of days within the year
            int days = random.nextInt(365);
            calendar.add(Calendar.DAY_OF_YEAR, -days);
        } else if (passengerType.equalsIgnoreCase("CHD")) {
            int years = 6+random.nextInt(6); // between 5 and 11 years
            // Subtract the random number of years from today's date
            calendar.add(Calendar.YEAR, -years);
            // Generate a random number of days within the year
            int days = random.nextInt(365);
            calendar.add(Calendar.DAY_OF_YEAR, -days);
        }else if (passengerType.equalsIgnoreCase("INS")) {
            int years = 1; // between 1 and 5 years
            // Subtract the random number of years from today's date
            calendar.add(Calendar.YEAR, -years);
            // Generate a random number of days within the year
            int days = random.nextInt(300);
            calendar.add(Calendar.DAY_OF_YEAR, -days);
        }else if (passengerType.equalsIgnoreCase("INF")) {
            int years = 0;
            calendar.add(Calendar.YEAR, -years);
            // Generate a random number of days within the year
            int days = random.nextInt(300);
            calendar.add(Calendar.DAY_OF_YEAR, -days);
        }
        // Get the random date
        Date randomDate = calendar.getTime();

        // Format the date to MM.DD.YYYY
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd.yyyy");
        return dateFormat.format(randomDate);
    }

}
