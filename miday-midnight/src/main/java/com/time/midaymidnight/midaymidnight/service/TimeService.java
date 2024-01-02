package com.time.midaymidnight.midaymidnight.service;

import org.springframework.stereotype.Service;
@Service
public class TimeService {
    public String getTimeInformation(String timeString) {
        String[] timeParts = timeString.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        int threshold = 60;

        int totalMinutes = hours * 60 + minutes;

        if (Math.abs(totalMinutes - 12 * 60) <= threshold) {
            return "It's Midday";
        }

        else if (Math.abs(totalMinutes) <= threshold || Math.abs(totalMinutes - 24 * 60) <= threshold) {
            return "It's Midnight";
        } else {
            return "It's neither Midday nor Midnight";
        }
    }
}

