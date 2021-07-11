package br.com.carlosjunior.springcrudaws.springcrudaws.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import br.com.carlosjunior.springcrudaws.springcrudaws.entities.User;
import br.com.carlosjunior.springcrudaws.springcrudaws.repositories.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

	//dependency injection
	@Autowired
	private UserRepository userRepository;

	// get all users
	@GetMapping
	public List<User> getAllUsers() {
		return this.userRepository.findAll();
	}

	// get user by id
	@GetMapping("/{id}")
	public User getUserById(@PathVariable(value = "id") Long userId) {
		return this.userRepository.findById(userId)
				.orElseThrow(() -> new ResourceAccessException("User not found with id: " + userId));
	}

	// create user
	@PostMapping
	public User createUser(@RequestBody User user) {
		return this.userRepository.save(user);
	}

	// update user
	@PutMapping("/{id}")
	public User updateUser(@RequestBody User user, @PathVariable(value = "id") Long userId) {
		User userExists = this.userRepository.findById(userId)
				.orElseThrow(() -> new ResourceAccessException("User not found with id: " + userId));

		userExists.setFirstName(user.getFirstName());
		userExists.setLastName(user.getLastName());
		userExists.setEmail(user.getEmail());
		return this.userRepository.save(userExists);

	}

	// delete user by id
	@DeleteMapping("/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable(value = "id") Long userId) {
		User userExists = this.userRepository.findById(userId)
				.orElseThrow(() -> new ResourceAccessException("User not found with id: " + userId));
		this.userRepository.delete(userExists);
		return ResponseEntity.ok().build();

	}
}
