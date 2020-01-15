package com.test.AgentRegistration.Entity;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "Agent")
public class Agent implements Serializable {

  @Id
  @Column(name = "id", unique = true)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "fname")
  @NotEmpty
  private String firstName;

  @Column(name = "lname")
  @NotEmpty
  private String lastName;

  @Column(name = "email")
  @NotEmpty
  private String email;

  @Column(name = "phoneno")
  @NotEmpty
  private String phoneNo;

  @Column(name = "inputAddress")
  @NotEmpty
  private String inputAddress;

  @Column(name = "inputAddress2")
  private String inputAddress2;

  @Column(name = "app_username")
  @NotEmpty
  private String username;

  @Column(name = "app_password")
  @NotEmpty
  private String password;


  public String getFname() {
    return firstName;
  }

  public String getLname() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneno() {
    return phoneNo;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getInputAddress() {
    return inputAddress;
  }

  public String getInputAddress2() {
    return inputAddress2;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public void setInputAddress(String inputAddress) {
    this.inputAddress = inputAddress;
  }

  public void setInputAddress2(String inputAddress2) {
    this.inputAddress2 = inputAddress2;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "Agent{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", email='" + email + '\'' +
        ", phoneNo='" + phoneNo + '\'' +
        ", inputAddress='" + inputAddress + '\'' +
        ", inputAddress2='" + inputAddress2 + '\'' +
        ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
