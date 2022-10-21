package com.Tech.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tech.Demo.Model.User;
import com.Tech.Demo.ServiceImpl.ServiceImpl;

@RestController
public class Controller {
	
	@Autowired
	private ServiceImpl Service;
	
	@RequestMapping("/")
	public String hello() 
	{
	return "Hello javaTpoint";
	}
	
	@GetMapping("/findAll")
	public List<User>  all(){
		return Service.findAll();
		
	}
	
	@GetMapping("{id}")
	public User findid( @PathVariable("id") int empid) {
		return Service.findbyid(empid);
	}
	
	@PostMapping("/saveuser")
	public User saveUser( @RequestBody User user) {
		return Service.SaveUser(user);
	}
	
	@DeleteMapping("{empid}")
	public void Deleteuser(@PathVariable ("empid")int empid) {
		Service.Deletebyid(empid);
	}
	
	
	
}
