package com.devsenior.ejercicio1.model.dto;

public class userDto {
 private String name;
 private String email;
 private String id;


 
 @Override
public String toString() {
    return "userDto [name=" + name + ", email=" + email + ", id=" + id + "]";
}
 public userDto(String name, String email, String id) {
    this.name = name;
    this.email = email;
    this.id = id;
}
 public String getName() {
    return name;
 }
 public void setName(String name) {
    this.name = name;
 }
 public String getEmail() {
    return email;
 }
 public void setEmail(String email) {
    this.email = email;
 }
 public String getId() {
    return id;
 }
 public void setId(String id) {
    this.id = id;
 }

 
}
