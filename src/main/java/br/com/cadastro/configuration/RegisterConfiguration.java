package br.com.cadastro.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterConfiguration {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
