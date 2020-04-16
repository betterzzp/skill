package cn.zhouzhongping.skill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="demo")
public class DemoController {
	@ResponseBody
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String sayHello() {
		return "Hello World";
	}
}
