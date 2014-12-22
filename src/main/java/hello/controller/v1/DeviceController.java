package hello.controller.v1;

import hello.domain.v1.Device;
import hello.repository.v1.DeviceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="DeviceControllerV1")
@RequestMapping("/api/v1")
public class DeviceController {

	@Autowired
	@Qualifier("v1DeviceRepository")
	private DeviceRepository deviceRepository;

	@RequestMapping("/devices")
	public Iterable<Device> findAll() {
		return deviceRepository.findAll();
	}
	
	@RequestMapping(value = "/devices/{id}", method = RequestMethod.GET)
	public Device get(@PathVariable("id") long id) {
		return deviceRepository.findOne(id);
	}
}
