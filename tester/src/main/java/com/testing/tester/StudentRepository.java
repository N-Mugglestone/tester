package com.testing.tester;

import org.springframework.data.mongodb.repository.MongoRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, String> {

Optional<Student> findStudentByEmail(String email);


}
