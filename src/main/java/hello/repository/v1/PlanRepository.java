package hello.repository.v1;

import hello.domain.v1.Plan;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(exported=false)
@Repository("v1PlanRepository")
public interface PlanRepository extends PagingAndSortingRepository<Plan, Long> {

}
