package com.test.AgentRegistration;

import com.test.AgentRegistration.Controller.RegistrationController;
import com.test.AgentRegistration.Entity.Agent;
import com.test.AgentRegistration.Repository.AgentRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

//import javafx.application.Application;
//import org.mockito.stubbing.OngoingStubbing;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegistrationControllerTest {

    @Autowired
    private RegistrationController registrationController;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    Agent agent;

    @MockBean
    private AgentRepository repository;

    @Test
    public void getRegistrationFormTest() throws Exception {
        //when(registrationController.getRegistrationForm()).thenReturn();
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/registration");
        MvcResult response = mockMvc.perform(requestBuilder).andReturn();
        //assertEquals("hello",registrationController.getRegistrationForm());
        Assert.assertEquals("Status code should be 200", response.getResponse().getStatus(),200);
    }

    @Test
    public void registerAgentTest() throws Exception {

        when(repository.save(agent)).thenReturn(any());
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/registration");
        MvcResult response = mockMvc.perform(requestBuilder).andReturn();
        //assertEquals(response.getResponse().getContentType(),);
        System.out.println("header name "+response.getResponse().getHeaderNames());
        Assert.assertEquals("Status code should be 200", response.getResponse().getStatus(),200);
        //Assert.assertEquals(response.getResponse().getContentType(), HttpContext.);


    }



}
