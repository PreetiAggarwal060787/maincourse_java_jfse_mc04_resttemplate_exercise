package com.stackroute.controller;

import com.stackroute.service.CovidStatService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1")
public class CovidStatController {
    private CovidStatService covidStatService;
    @Autowired
    public CovidStatController(CovidStatService covidStatService) {
        this.covidStatService = covidStatService;
    }
    @GetMapping("/covidstat")
    public ResponseEntity<?> getCovidStat() {
        // Your implementation to retrieve and return COVID-19 statistics
        // ...
        // Include "summary" in the response
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("summary", "YourSummaryDataHere"); // Add your summary data
        return ResponseEntity.ok(response);
    }
    }