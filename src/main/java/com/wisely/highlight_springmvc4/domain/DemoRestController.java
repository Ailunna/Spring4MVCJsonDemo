//package com.wisely.highlight_springmvc4.domain;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
////声明这个类是控制器, 并且返回数据时不需要@ResponseBody
//@RestController 
//@RequestMapping("/rest")
//public class DemoRestController {
//
//	@RequestMapping(value="/getjson", produces= {"application/json;charset=UTF-8"})
//	public DemoObj getjson(DemoObj obj) {
//		return new DemoObj(obj.getId()+1, obj.getName()+"yy");
//	}
//	
//	@RequestMapping(value="/getxml", produces= {"application/xml;charset=UTF-8"})
//	public DemoObj getxml(DemoObj obj) {
//		return new DemoObj(obj.getId()+1, obj.getName()+"qq");
//	}
//}
