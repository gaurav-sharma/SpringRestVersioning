package hello.web;

import hello.web.domain.Device;
import hello.web.domain.Plan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {
	
	private static final String BASE_API_URL = "http://localhost:8080/api/v1/";
	
	@RequestMapping("/")
    public String home(Model model) {
		
		model.addAttribute("page", "index");
		
        return "index";
    }
	
	@RequestMapping("/phones")
	public String phones(Model model) {
		
		RestTemplate restTemplate = new RestTemplate();
		
	    Device[] devices = restTemplate.getForObject(BASE_API_URL + "devices", Device[].class);
	    model.addAttribute("devices", devices);
	    
	    model.addAttribute("page", "phones");
	    
	    return "phones";
	}
	
	@RequestMapping("/plans")
	public String plans(Model model) {
		
		RestTemplate restTemplate = new RestTemplate();
		
	    Plan[] plans = restTemplate.getForObject(BASE_API_URL + "plans", Plan[].class);
	    model.addAttribute("plans", plans);
		
		model.addAttribute("page", "plans");
	    
	    return "plans";
	}
	
	@RequestMapping("/accessories")
	public String accessories(Model model) {
		
		model.addAttribute("page", "accessories");
	    
	    return "accessories";
	}
	
	@RequestMapping("/faq")
	public String faq(Model model) {
		
		model.addAttribute("page", "faq");
	    
	    return "faq";
	}
}
