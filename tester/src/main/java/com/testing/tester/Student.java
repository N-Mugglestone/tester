package com.testing.tester;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


    //use Lombok to reduce the need of  putting in all the constructors, getters and setters
    @Data
    @Document
 public class Student {
    @Id
     private String id;
     private String firstName;
     private String lastName;
     private String email;
     private Gender gender;
     private Address address;
     private String bestSubject;
     private LocalDateTime created;


    public Student(String firstName,
                       String lastName,
                       String email,
                       Gender gender,
                       Address address,
                       String bestSubject,
                       LocalDateTime created) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.gender = gender;
            this.address = address;
            this.bestSubject = bestSubject;
            this.created = created;
    }
}
