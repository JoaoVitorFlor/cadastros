package br.com.cadastro.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.cadastro.register.model.Registered;
import br.com.cadastro.register.repository.RegisteredRepository;


@Controller
public class RegisterConfiguration {
	
	@Autowired
	private RegisteredRepository repository;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("register")
	public String register(Model model) {
		Iterable<Registered> registereds = repository.findAll();
		
		model.addAttribute("registereds", registereds);
		
		return "register";
	}
	
	@RequestMapping(value = "tosave", method = RequestMethod.POST)
	public String tosave (@RequestParam("nickname") String nickname, 
			@RequestParam("phone") String phone,@RequestParam("email") String email) {
		
		Registered newregistered = new Registered(nickname , phone, email);
		repository.save(newregistered);
		
		return "register";
	}

}
