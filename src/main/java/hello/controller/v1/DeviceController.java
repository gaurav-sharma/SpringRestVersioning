package hello.controller.v1;

import hello.domain.v1.Device;
import hello.repository.v1.DeviceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="DeviceControllerV1")
public class DeviceController {

	@Autowired
	@Qualifier("v1DeviceRepository")
	private DeviceRepository deviceRepository;

	@RequestMapping("/v1/devices")
	public Page<Device> findAll(Pageable page) {
		return deviceRepository.findAll(page);
	}
}
