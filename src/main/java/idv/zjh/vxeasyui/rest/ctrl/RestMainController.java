package idv.zjh.vxeasyui.rest.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMainController {

	@RequestMapping("/123")
	public String index() {
		return "Thymeleaf";
	}
}
