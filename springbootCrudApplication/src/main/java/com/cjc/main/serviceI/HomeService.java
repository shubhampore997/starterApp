package com.cjc.main.serviceI;

import java.util.Iterator;
import java.util.List;

import com.cjc.main.model.Student;

public interface HomeService {

	public void saveData(Student s);

	public Iterable<Student> discplayAllData();

	public void deleteData(Student s);

	public Student editData(int uid);

	 public Student findByUnameAndPassword(String un,String ps);
	

	

}
