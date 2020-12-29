package br.com.spring.curso.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView test() {
		ModelAndView view = new ModelAndView("welcome");
		view.addObject("test", "Olá, estou aqui para testar a aplicação com Spring MVC");
		return view;
	}
}
