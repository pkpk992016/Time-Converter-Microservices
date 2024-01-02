package com.time.converter.converter.service;

import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class TimeService {

    public String convertUserInputToWords(String userInputTime) {
        try {
            LocalTime time = LocalTime.parse(userInputTime);
            int hours = time.getHour();
            int minutes = time.getMinute();

            String hoursInWords = convertNumberToWords(hours);
            String minutesInWords = convertNumberToWords(minutes);

            return "It's " + hoursInWords + " " + (minutes > 0 ? minutesInWords + " " : "") + (minutes == 1 ? "minute" : "minutes");
        } catch (Exception e) {
            e.printStackTrace();
            return "Error converting time to words. Please provide a valid time in HH:mm format.";
        }
    }

    private String convertNumberToWords(int number) {
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty"};

        if (number == 0) {
            return "zero";
        } else if (number < 10) {
            return units[number];
        } else if (number < 20) {
            return teens[number - 10];
        } else {
            return tens[number / 10] + (number % 10 > 0 ? " " + units[number % 10] : "");
        }
    }
}

