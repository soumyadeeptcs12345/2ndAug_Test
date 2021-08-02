package com.RestWebServices.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;





@RestController

public class UserResource {
	
	
	@Autowired
	private UserDAOService service;
	
	//RetrieveUsers
	@GetMapping("/createProduct")
	public List<Question1> RetrieveUsers() {
		
		return service.findAll();
	}
	
	@GetMapping("/Users/{id}")
	public Question1 retrieveUsers(@PathVariable int id) {
		
		Question1 user = service.findOne(id);
			if (user == null)
				throw new UserNotFoundException("id -" + id);
				
				return user;
		
	}
	
	
	
	
	//input - details of user
	// output - CREATED & Return the created URI
		@PostMapping("/createProduct")
		public ResponseEntity<Object> createUser(@RequestBody Question1 user) {
			
			Question1 savedUser = service.save(user);
			
			//CREATED
			// /user/4
			
		URI location = ServletUriComponentsBuilder.
		fromCurrentRequest().
		path("/{id}").
		buildAndExpand(savedUser.
				getProductid()).toUri();
		
		return ResponseEntity.created(location).build();
		
		//delete
		
		}
		
		@DeleteMapping("/Users/{id}")
		public Question1 deleteuser(@PathVariable int productid) throws Exception {
			
			Question1 user = service.deleteById(productid);
			
			if (user == null)
				throw new Exception("productid-"+ productid);
			
			return user;
		}
			
			

}
