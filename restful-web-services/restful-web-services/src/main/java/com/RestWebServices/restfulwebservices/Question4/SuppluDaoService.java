package com.RestWebServices.restfulwebservices.Question4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Date;
import java.util.Iterator;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Component;

@Component
public class SuppluDaoService {
	
	private static List<Question4> qfour = new ArrayList<>();
	
	public int q4 = 3;
	
	
	static {
		qfour.add (new Question4(1, "2021-03-16T08:53:48:616Z", 10,"Exists"));
		qfour.add (new Question4(2, "2021-03-16T08:53:48:616Z", 5,"Exists"));
		qfour.add (new Question4(3, "2021-03-16T08:53:48:616Z", 30,"Exists"));
		qfour.add (new Question4(3, "2021-03-16T08:53:48:616Z", 20,"Exists"));
	}
	
	public List<Question4> findAll(){
		return qfour;
	}
	
	public Question4 save(Question4 user) {
		if(user.getProductid()==0) {
			user.setProductid(++q4);
		}
		qfour.add(user);
		return user;
	}
	
	public Question4 findOne(int Productid) {
		for (Question4 user : qfour) {
			if(user.getProductid()== Productid) {
				return user;
			}
		}
		
		return null;
	}
	
	public Question4 deleteById(int Productid) {
		
		Iterator<Question4> iterator = qfour.iterator();
		while (iterator.hasNext()) {
			Question4 user = iterator.next();
			if(user.getProductid()== Productid) {
				iterator.remove();
				return user;
			} 
		
	}
		return null;

	}
}
