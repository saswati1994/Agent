package com.test.AgentRegistration;

import antlr.build.Tool;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LoginControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getLoginFormTest() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/login");

        MvcResult response = mockMvc.perform(requestBuilder).andReturn();
        //assertEquals("hello",registrationController.getRegistrationForm());
        Assert.assertEquals("Status code should be 200", response.getResponse().getStatus(),200);
    }
}
