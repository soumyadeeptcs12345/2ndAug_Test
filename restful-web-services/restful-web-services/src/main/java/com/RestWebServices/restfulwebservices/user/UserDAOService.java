package com.RestWebServices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Date;
import java.util.Iterator;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Component;

@Component
public class UserDAOService {
	
	private static List<Question1> users = new ArrayList<>();
	
	public int usersCount = 3;
	
	
	static {
		users.add (new Question1(1, "Shirt", "EACH","Exists"));
		users.add (new Question1(2, "Trousers", "EACH","Exists"));
		users.add (new Question1(2, "Tie", "EACH","Exists"));
	}
	
	public List<Question1> findAll(){
		return users;
	}
	
	public Question1 save(Question1 user) {
		if(user.getProductid()==0) {
			user.setProductid(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public Question1 findOne(int Productid) {
		for (Question1 user : users) {
			if(user.getProductid()== Productid) {
				return user;
			}
		}
		
		return null;
	}
	
	public Question1 deleteById(int Productid) {
		
		Iterator<Question1> iterator = users.iterator();
		while (iterator.hasNext()) {
			Question1 user = iterator.next();
			if(user.getProductid()== Productid) {
				iterator.remove();
				return user;
			} 
		
	}
		return null;

	}
}
