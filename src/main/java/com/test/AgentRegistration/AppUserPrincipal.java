package com.test.AgentRegistration;


import com.test.AgentRegistration.Entity.Agent;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class AppUserPrincipal implements UserDetails {


  private final Agent agent;


  public AppUserPrincipal(Agent agent) {
    this.agent = agent;
  }

  //

  @Override
  public String getUsername() {
    return agent.getUsername();
  }

  @Override
  public String getPassword() {
    return agent.getPassword();
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    final List<GrantedAuthority> authorities = Collections
        .singletonList(new SimpleGrantedAuthority("User"));
    return authorities;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }


  public Agent getAgent() {
    return agent;
  }

}


