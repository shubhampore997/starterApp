package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student,Integer> {
	
	
   public Student findByUnameAndPassword(String un,String ps);

   public Student findByUid(int uid);
}
