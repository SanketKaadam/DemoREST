package com.telusko.DemoREST;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


public class AlienRepository {
	
	List<Alien> aliens;
	
	public AlienRepository(){
		
		aliens = new ArrayList<Alien>();
		
		Alien a1 = new Alien();
		a1.setId(101);
		a1.setName("Navin");
		a1.setPoints(60);
		
		Alien a2 = new Alien();
		a2.setId(102);
		a2.setName("Aarti");
		a2.setPoints(70);
		
		aliens.add(a1);
		aliens.add(a2);
		
	}
	
	public List<Alien> getAliens(){
		
		return aliens;
	}
	
	public Alien getAlien(int id) {
		
		for(Alien a : aliens) {
			if(a.getId()==id) {
				return a;
			}
		}
		
		return new Alien();
	}

	public void create(Alien a1) {
		// TODO Auto-generated method stub
		
		aliens.add(a1);
	}

}
