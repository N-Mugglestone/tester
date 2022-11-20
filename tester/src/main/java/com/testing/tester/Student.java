package com.testing.tester;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDateTime;


//use Lombok to reduce the need of  putting in all the constructors, getters and setters

    @Data
    @Document
 public class Student {

    @Id
     private long id;

    @NotNull
     private String firstName;
    @NotNull
     private String lastName;
    @NotNull
     @Indexed(unique = true)
     private String email;

     private LocalDateTime created;


    public Student(String firstName,
                       String lastName,
                       String email,
                       LocalDateTime created) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.created = created;
    }
}
