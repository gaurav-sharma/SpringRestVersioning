package hello.controller.v1;

import hello.domain.v1.Person;
import hello.repository.v1.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="PersonControllerV1")
public class PersonController {
	
	@Autowired
	@Qualifier("v1PersonRepository")
	private PersonRepository personRepository;

	@RequestMapping("/v1/people")
	public Iterable<Person> getPeople() {
		return personRepository.findAll();
	}
}
