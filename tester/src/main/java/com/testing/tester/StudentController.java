package com.testing.tester;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor


public class StudentController {

        private final StudentService studentService;


        @GetMapping
        public List<Student> fetchAllStudents(){
            return studentService.getAllStudents();
        }
}
