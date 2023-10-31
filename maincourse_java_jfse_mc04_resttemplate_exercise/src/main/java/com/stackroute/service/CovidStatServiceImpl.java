package com.stackroute.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class CovidStatServiceImpl implements CovidStatService {
    private RestTemplate restTemplate;
    private Environment environment;
    @Autowired
    public CovidStatServiceImpl(RestTemplate restTemplate, Environment environment) {
        this.restTemplate = restTemplate;
        this.environment = environment;
    }
    // Implement your service methods 
    @Override
    public String getCovidStats() {
        // Make a REST API call to the external COVID stats API using restTemplate
        String apiUrl = "https://api.rootnet.in/covid19-in/stats/latest";
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
