package com.abc.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.abc.student.dal.entities.Student;
 
public interface StudentRepository extends CrudRepository<Student, Long> {

	 

}
