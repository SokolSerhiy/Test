package ua.lviv.lgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ua.lviv.lgs.entity.Person;
import ua.lviv.lgs.repository.PersonRepository;

@Controller
public class PersonController {
	
	@Autowired
	private PersonRepository repository;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("persons", repository.findAll());
		return "index";
	}
	
	@PostMapping("/")
	public String save(Person person) {
		repository.save(person);
		return "redirect:/";
	}
}
