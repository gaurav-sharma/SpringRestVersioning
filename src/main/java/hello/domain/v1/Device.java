package hello.domain.v1;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Device {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	private boolean isSmart;
	private float rate;
	
	@ManyToMany
	private Set<Plan> plans;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(long rate) {
		this.rate = rate;
	}
	public boolean isSmart() {
		return isSmart;
	}
	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	public Set<Plan> getPlans() {
		return plans;
	}
	public void setPlans(Set<Plan> plans) {
		this.plans = plans;
	}
	
	
}
