package idv.zjh.vxeasyui.ctrl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import idv.zjh.vxeasyui.service.IIndex;

@Controller
public class PageController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "首頁");
		return new ModelAndView("index", map);
	}
	
	/**
	 * vx-easyUI Demo
	 * @return
	 */
	@RequestMapping("/vue/page1")
	public ModelAndView vxeasyuiDemo() {
		return new ModelAndView("vue/page1");
	}
}