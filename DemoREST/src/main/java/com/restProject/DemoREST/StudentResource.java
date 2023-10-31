package com.telusko.DemoREST;


import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Students")
public class StudentResource {
	
	StudentRepository repo = new StudentRepository();
 
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Student> getStudents() {
		System.out.println("Method Called");
		
		
		return repo.getStudents();
	}
	
	
	@GET
	@Path("Student/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Student getStudent(@PathParam("id") int id) {
		
		return  repo.getStudent(id);
	} 
	
	@POST
	@Path("Student")
	public Student createStudent(Student a1) {
		System.out.println(a1);
		repo.create(a1);
		
		return a1;
	}
}
