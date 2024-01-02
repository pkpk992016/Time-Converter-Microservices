package com.time.midaymidnight.midaymidnight.controller;

import com.time.midaymidnight.midaymidnight.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class TimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping("/{timeString}")
    public String getTimeInfo(@PathVariable String timeString) {
        try {

            return timeService.getTimeInformation(timeString);
        } catch (IllegalArgumentException e) {
            return "Invalid time format. Please use the format HH:mm";
        }
    }
}

