package com.example.rest.webservices.restful_web_servies_socialmedia.helloWorld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	private MessageSource messageSource;
	
	public HelloWorldController(MessageSource messageSource) {
		super();
		this.messageSource = messageSource;
	}

	@RequestMapping(path="/hello-world",method=RequestMethod.GET)
	public HelloWorldBean displayHellowWorldBean(){
		
		return new HelloWorldBean("hello-world");
	}
	
	@RequestMapping(path="/hello-world-Bean",method=RequestMethod.GET)
	public String displayHellowWorld(){
		
		return ("hello-world");
	}
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean displayHellowWorldPathVariable(@PathVariable String name){
		
		return new HelloWorldBean(String.format("Hello, %s", name));
	}
	
	@GetMapping(path="/hello-world/int")
	public String helloWorldInternationalized(){
		Locale locale=LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
	}
}
