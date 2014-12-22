package hello.web.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Plan {

	private String name;
	private PlanType planType;

	private float rate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PlanType getType() {
		return planType;
	}

	public void setType(PlanType planType) {
		this.planType = planType;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}
}
