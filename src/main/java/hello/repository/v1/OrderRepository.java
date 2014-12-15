package hello.repository.v1;

import hello.domain.v1.Order;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@RestResource(exported=false)
@Repository("v1OrderRepository")
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {

}
