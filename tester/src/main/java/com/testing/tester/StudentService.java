package com.testing.tester;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;
import com.testing.tester.Student;

@AllArgsConstructor
//@Component
@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentService studentService){
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student saveStudent(Student students){
      return studentRepository.save(students);
    }

//    public List<Student> deleteStudent(){
//        return studentRepository.deleteStudentByName();
//    }

    
}
