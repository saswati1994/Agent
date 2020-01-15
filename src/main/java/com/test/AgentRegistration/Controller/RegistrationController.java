package com.test.AgentRegistration.Controller;

import com.test.AgentRegistration.Entity.Agent;

import com.test.AgentRegistration.Repository.AgentRepository;
import com.test.AgentRegistration.Service.RegistrationService;
import com.test.AgentRegistration.exception.UserExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

  @Autowired
  RegistrationService registrationService;

  @Autowired
  AgentRepository agentRepository;

  @Autowired
  PasswordEncoder passwordEncoder;

  @RequestMapping(value = "/registration", method = RequestMethod.GET)
  public String getRegistrationForm() {
    return "registration";
  }

  @RequestMapping(value = "/registration", method = RequestMethod.POST)
  public String registerAgent(
      @ModelAttribute(name = "RegistrationForm") Agent agent, Model model)
      throws UserExistsException {

    agent.setPassword((passwordEncoder.encode(agent.getPassword())));
    registrationService.validate(agent);
    agentRepository.save(agent);
    return "success-reg";
  }
}
