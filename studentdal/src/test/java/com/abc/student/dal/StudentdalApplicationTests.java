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
	 //to create: hibernate will use insert query in console
	 public void testCreateStudent(){
		 Student student=new Student();
		 student.setName("Jerry");
		 student.setCourse("Java");
		 student.setFee(5000d);

		 studentRepository.save(student);
		 
		 
	 }
	 
	 //to read: hibernate will use select query in console
	 
	 @Test
	 
	 public void testFindStudentById() {
		 Student student= studentRepository.findById(1l).get();
		 System.out.println(student);
	 }
	 
	 
	 //to update:
	 @Test
	 public void testUpdateStudent()
	 {
		 
		 Student student =studentRepository.findById(1l).get();
		 student.setFee(60d);
		 studentRepository.save(student);
	 }
	 	 
	/*
	 * @Test public void testDeleteStudent() { Student student=new Student();
	 * student.setId(1l); studentRepository.delete(student); }
	 */

}
