package restful_web_services.RestfulWebServiceApplication.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
//GET/users
	//we need to autowire userDaoservice to UserResource so we can get data from a component
	
	private userDaoService service;
	// creating constructor injection here
	public UserResource(userDaoService service) {
		this.service = service;
	}
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
		
	}
	
	@GetMapping("/users/{id}")
	public User retrieveOneUser(@PathVariable int id){
		return service.findOne(id);
		
	}
}
