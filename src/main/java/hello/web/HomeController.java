package hello.web;

import hello.web.domain.Device;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {
	
	@RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
	
	@RequestMapping("/devices")
	public String Home(Model model) {
		
		RestTemplate restTemplate = new RestTemplate();
		
	    Device device = restTemplate.getForObject("http://localhost:8080/api/v1/devices/1", Device.class);
	    
	    model.addAttribute("name", device.getName());
	    model.addAttribute("rate", device.getRate());
	    model.addAttribute("isSmart", device.isSmart());
	    
	    Device[] devices = restTemplate.getForObject("http://localhost:8080/api/v1/devices", Device[].class);
	    model.addAttribute("devices", devices);
	    
	    return "devices";
	}
}
