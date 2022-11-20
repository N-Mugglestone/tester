package com.testing.tester;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.testing.tester.StudentService;

@RestController
@RequestMapping("/api/")
@AllArgsConstructor
@Log
public class StudentController {

    @Autowired
    StudentService studentService;


    @GetMapping(path = StudentLinks.List_Students)
    public ResponseEntity<?> listStudents(){
        log.info("StudentController: list students");
        List<Student> resource = studentService.getAllStudents();
        return ResponseEntity.ok(resource);
    }

//    @PostMapping(path = StudentLinks.Add_Student)
//    public ResponseEntity<?> saveStudent(@RequestBody Student student){
//        log.info("StudentController: list students");
//        Student resource = (studentService.saveStudent(student));
//        return ResponseEntity.ok(resource);
//}


//    @Autowired
//    StudentService studentService;

//    @GetMapping
//    public List<Student> fetchAllStudents(){
//        return studentService.getAllStudents();
//    }

//    @PostMapping(path = StudentLink.List_Student);
//    public ResponseEntity<?> saveStudent


//    @DeleteMapping
//    public List<Student> deleteStudent(){
//        return studentService.deleteStudent();
//    }




    //next steps are to introduce delete, post, update, post etc.

}
