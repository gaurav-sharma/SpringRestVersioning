package hello.controller.v2;

import hello.domain.v2.Person;
import hello.repository.v2.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="PersonControllerV2")
public class PersonController {
	
	@Autowired
	@Qualifier("v2PersonRepository")
	private PersonRepository personRepository;

	@RequestMapping("/v2/people")
	public Iterable<Person> getPeople() {
		return personRepository.findAll();
	}
}
