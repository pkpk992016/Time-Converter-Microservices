package com.time.converter.converter.controller;

import com.time.converter.converter.service.TimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/time")
public class TimeController {

    @Autowired
    private TimeService timeService;
    @Autowired
    private RestTemplate restTemplate;
    private static final String OTHER_CONTROLLER_URL = "http://localhost:8082/time";

    //http://localhost:8081/time/convert?time=11:25

    @GetMapping("/convert")
    public ResponseEntity<String> convertUserInputToWords(@RequestParam String time) {
        String result = timeService.convertUserInputToWords(time);

        String otherControllerResult = restTemplate.getForObject(OTHER_CONTROLLER_URL + "/" + time, String.class);

        return ResponseEntity.ok(result + "\n" + "Result from Other Controller: " + otherControllerResult);
    }
}
