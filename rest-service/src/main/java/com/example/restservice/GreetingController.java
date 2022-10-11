package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	// private static final String template = "Hello, %s!";
	// private final AtomicLong counter = new AtomicLong();


    @GetMapping("")
	public String greeting(@RequestParam(value = "", defaultValue = "World") String name) {
		return ("change url endpoint to /name or /time");
	}

	@GetMapping("/name")
	public String nm(@RequestParam(value = "name", defaultValue = "World") String name) {
		return ("My name is Sterling Cole. \nMy username is scole40@gatech.edu");
	}

	@GetMapping("/time")
	public String tm(@RequestParam(value = "time", defaultValue = "World") String name) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = localDateTime.format(myFormatObj);
        return (formattedDate);
	}
}