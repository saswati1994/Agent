package com.test.AgentRegistration.Service;

import com.test.AgentRegistration.Entity.Agent;
import com.test.AgentRegistration.Repository.AgentRepository;

import com.test.AgentRegistration.exception.UserExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    AgentRepository agentRepository;

    public void validate(Agent agent)throws UserExistsException {
        System.out.println(agent);
        Agent searchAgent = new Agent();
        searchAgent.setEmail(agent.getEmail());
        searchAgent.setPhoneNo(agent.getPhoneno());
       Example <Agent> agentExample =  Example.of(searchAgent);

        List<Agent> agents = agentRepository.findAll(agentExample);
        if(agents.size() == 0){
            return;
        }
        else {
            throw new UserExistsException("error");
        }


    }

}
