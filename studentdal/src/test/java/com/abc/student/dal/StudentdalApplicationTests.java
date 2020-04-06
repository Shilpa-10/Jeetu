package com.abc.student.dal;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.abc.student.dal.entities.Student;
import com.abc.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
 @SpringBootTest
 
public class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;
	 @Test
	 public void testCreateStudent(){
		 Student student=new Student();
		 student.setName("Jerry");
		 student.setCourse("Java");
		 student.setFee(5000d);

		 studentRepository.save(student);
		 
	 }

}
