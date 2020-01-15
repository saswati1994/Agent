package com.test.AgentRegistration;

import com.test.AgentRegistration.Entity.Agent;
import com.test.AgentRegistration.Repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserService implements UserDetailsService {

  @Autowired
  AgentRepository agentRepository;


  @Override
  public UserDetails loadUserByUsername(String s)
      throws UsernameNotFoundException {

    Agent agent = agentRepository.findByUsername(s);
    AppUserPrincipal userPrincipal = new AppUserPrincipal(agent);

    return userPrincipal;

  }


}
