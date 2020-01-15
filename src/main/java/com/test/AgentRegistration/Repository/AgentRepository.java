package com.test.AgentRegistration.Repository;

import com.test.AgentRegistration.Entity.Agent;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Long> {

  Agent findByUsername(String username);
}
