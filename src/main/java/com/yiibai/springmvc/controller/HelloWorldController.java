//package com.yiibai.springmvc.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.study.pattern.proxy.IProxyInterface;
//import com.study.pattern.proxy.ProxyClass;
//
//@Controller
//@RequestMapping("/")
//public class HelloWorldController {
//
//	@RequestMapping(method = RequestMethod.GET)
//	public String sayHello(ModelMap model) {
//		model.addAttribute("greeting", "Hello World from Spring 4 MVC");
//		IProxyInterface proxyTest = new ProxyClass();
//		proxyTest.proxyMethod("proxy method testing");
//		return "welcome";
//	}
//
//	@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
//	public String sayHelloAgain(ModelMap model) {
//		model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
//		return "welcome";
//	}
//
////	@RequestMapping(value="/getxml", produces= {"application/xml;charset=UTF-8"})
////	public DemoObj getxml(DemoObj obj) {
////		return new DemoObj(obj.getId()+1, obj.getName()+"qq");
////	}
//} 