package com.testing.tester;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;
import com.testing.tester.Student;

@AllArgsConstructor
@Service

public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentService studentService){
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

//    public List<Student> saveStudent(){
//      return studentRepository.save(student);
//    }

//    public List<Student> deleteStudent(){
//        return studentRepository.deleteStudentByName();
//    }

    
}
