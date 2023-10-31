package com.stackroute.test.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@ExtendWith(MockitoExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class CovidStatControllerTest {
    @Autowired
    private MockMvc mockMvc;

    /**
     * Test annotation tells JUnit that the public void method to which it is attached can be run as a test case
     */
    @Test
    void givenGetMappingUrlThenShouldReturnTheJSONResult() throws Exception {
        String expectedData = "true";
        mockMvc.perform(get("/api/v1/covidstat"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;"))
                .andExpect(content().string(containsString("summary")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(expectedData));
    }

}
