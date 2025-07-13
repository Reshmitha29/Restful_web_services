package restful_web_services.RestfulWebServiceApplication.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

//DAO service is created to perform actions in data saved in DB
//We need to create DB , use Hibernate/JPA to talk to > Database
// initialy lets try to userDaoService > Static list

@Component
public class userDaoService {

	//public List<user> findAll()
	//public User save(User user)
	//public User findOne(int id)
	
	//lets create a static list of users
	public static List<User> users=new ArrayList<>();
	static {
		users.add(new User(1, "Madhavan",LocalDate.now().minusYears(30)));
		users.add(new User(2, "Vijay",LocalDate.now().minusYears(20)));
		users.add(new User(3, "Surya",LocalDate.now().minusYears(32)));
	}
	
	public List<User> findAll(){
		return users;
		
	}
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
		
	}
	
}
