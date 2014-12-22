package hello.controller.v1;

import hello.domain.v1.Plan;
import hello.repository.v1.PlanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="PlanControllerV1")
@RequestMapping("/api")
public class PlanController {
	
	@Autowired
	@Qualifier("v1PlanRepository")
	private PlanRepository planRepository;

	@RequestMapping("/v1/plans")
	public Page<Plan> findAll(Pageable page) {
		return planRepository.findAll(page);
	}
}
