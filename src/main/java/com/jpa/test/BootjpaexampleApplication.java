package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository= context.getBean(UserRepository.class);
		
		//Adding a single user
		//Adding a single user
/*		User user= new User();
		user.setName("Gajanan");
		user.setCity("Udgir");
		user.setStatus("Programmer");
		
		User user1=userRepository.save(user);
		System.out.println(user1);
*/
		//Adding multiple user
/*		User user1= new User();
		user1.setName("Krishna");
		user1.setCity("Latur");
		user1.setStatus("Java Programmer");
		
		
		User user2= new User();
		user2.setName("Pankaj");
		user2.setCity("Pune");
		user2.setStatus("Python Programmer");
		
		List<User> users= List.of(user1, user2);
		Iterable<User> result=userRepository.saveAll(users);
		
		result.forEach(user -> System.out.println(user));
*/
		
		//Update User
/*		Optional<User> optional= userRepository.findById(2);
		User user= optional.get();
		user.setName("Krish");
		User result=userRepository.save(user);
		System.out.println(result);
*/
		
		//Deleting a user
/*		userRepository.deleteById(2);
		System.out.println("deleted");
		
		//Deleting all user
		Iterable<User> allUsers=userRepository.findAll();
		allUsers.forEach(user-> System.out.println(user));
		userRepository.deleteAll(allUsers);
*/
	}

}
