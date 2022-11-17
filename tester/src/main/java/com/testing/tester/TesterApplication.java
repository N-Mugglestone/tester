package com.testing.tester;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class TesterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesterApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate) {
		return args -> {

			Address address = new Address(
					"England",
					"London",
					"NE9 4RF"
			);
			String email = "jahmed@gmail.com";
			Student student = new Student(
					"Jamila",
					"Ahmed",
					email,
					Gender.FEMALE,
					address,
					"Math",
					LocalDateTime.now()
			);


			Query query = new Query();
			query.addCriteria(Criteria.where("email").is(email));

			List<Student> students = mongoTemplate.find(query, Student.class);

			if (students.contains(email)){
				System.out.println(email + "already exists");
			}

//			if (students.isEmpty()){
//				System.out.println("Student added, welcome" + student);
//				repository.insert(student);
//			}else{
//				System.out.println(student + "already exists");
//			}

			if (students.contains(student.getId())
			){
				System.out.println(student + "already exists");
			}else{
				System.out.println("Student added, welcome " + student.getFirstName());
			}

			repository.insert(student);

		};
}

}

// This could work for Java 9 and beyond but the .ifPresentOrElse Optional does not work for Java 8.

//	private void usingMongoTemplateAndQuery(StudentRepository repository, MongoTemplate mongoTemplate, String email, Student student) {
//			repository.findStudentByEmail(email)
//					.ifPresentOrElse(s -> {
//						System.out.println(s + "already exists");
//					}, ()->{
//						System.out.println("Inserting student" + student);
//						repository.insert(student);
//					});


