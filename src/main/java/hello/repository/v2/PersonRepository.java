package hello.repository.v2;

import hello.domain.v2.Person;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@RestResource(exported=false)
@Repository("v2PersonRepository")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

}
