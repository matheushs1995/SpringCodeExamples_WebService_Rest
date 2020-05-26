package matheus.io.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import matheus.io.project.entity.User;
import matheus.io.project.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserRepository useRepository;
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public List<User> findAll() {
		List <User> users = this.useRepository.findAll();
		
		return users;
	}
	
	@RequestMapping(value="", method = RequestMethod.POST)
	public User save(@RequestBody User user) {
		return useRepository.save(user);
	}
	
	@RequestMapping(value="", method = RequestMethod.PUT)
	public User update(@RequestBody User user) {
		return useRepository.save(user);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		this.useRepository.deleteById(id);
	}
	
	
	
}
