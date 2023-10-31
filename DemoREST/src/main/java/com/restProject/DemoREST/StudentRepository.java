package com.telusko.DemoREST;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


public class StudentRepository {
	
	List<Student> Students;
	
	public StudentRepository(){
		
		Students = new ArrayList<Student>();
		
		Student a1 = new Student();
		a1.setId(101);
		a1.setName("Navin");
		a1.setPoints(60);
		
		Student a2 = new Student();
		a2.setId(102);
		a2.setName("Aarti");
		a2.setPoints(70);
		
		Students.add(a1);
		Students.add(a2);
		
	}
	
	public List<Student> getStudents(){
		
		return Students;
	}
	
	public Student getStudent(int id) {
		
		for(Student a : Students) {
			if(a.getId()==id) {
				return a;
			}
		}
		
		return new Student();
	}

	public void create(Student a1) {
		// TODO Auto-generated method stub
		
		Students.add(a1);
	}

}
