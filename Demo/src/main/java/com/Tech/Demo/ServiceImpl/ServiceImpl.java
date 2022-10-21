package com.Tech.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tech.Demo.Model.User;
import com.Tech.Demo.Repo.UserRepo;

@Service
public class ServiceImpl implements UserService {
	
	@Autowired
	UserRepo Repo;

	@Override
	public List<User> findAll() {
		 return Repo.findAll();
	}

	@Override
	public User findbyid(int empid) {
		return Repo.findById(empid).get();
		
	}

	@Override
	public User SaveUser(User user) {
		
		return Repo.save(user);
	}

	@Override
	public void Deletebyid(int empid) {
		
		 Repo.deleteById(empid);
	}
	
	

}
