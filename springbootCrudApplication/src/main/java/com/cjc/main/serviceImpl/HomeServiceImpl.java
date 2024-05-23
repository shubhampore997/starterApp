package com.cjc.main.serviceImpl;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.serviceI.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeRepository hr;
	
	
	@Override
	public void saveData(Student s) {
		
	hr.save(s);
	}


	@Override
	public Iterable<Student> discplayAllData() {
		
		
		return hr.findAll();
	}


	@Override
	public void deleteData(Student s) {
		
		hr.delete(s);
		
	}


	@Override
	public Student editData(int uid) {
		
		return hr.findByUid(uid);
	}


	@Override
	public Student findByUnameAndPassword(String un, String ps) {
		
		return hr.findByUnameAndPassword(un, ps);
	}


	

	

}
