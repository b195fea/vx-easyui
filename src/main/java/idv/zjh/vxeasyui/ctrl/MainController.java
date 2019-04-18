package idv.zjh.vxeasyui.ctrl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import idv.zjh.vxeasyui.model.Person;
import idv.zjh.vxeasyui.service.IIndex;

@Controller
public class MainController {
	
	@Autowired
	private IIndex service;

	@RequestMapping("/")
	public ModelAndView index() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "Thymeleaf1651616sagsgsgsfagsag5165");
		return new ModelAndView("index", map);
	}
	
	@RequestMapping("/model")
	@ResponseBody
	public Person getModel() {
		return service.getModel();
	}
}
