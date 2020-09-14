package com.example.demo;

import java.security.NoSuchAlgorithmException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.DTO.UserService;
import com.example.demo.repository.UserRepository;

@Controller
public class WebController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
    private UserService userService;
	
	@GetMapping("/register")
	//@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String GetRegister(Model model)
	{
		model.addAttribute("add", new DoctorEntity());
		return "register";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute DoctorEntity body) throws NoSuchAlgorithmException
	{
		userRepository.save(body);
		return "redirect:/table";
	}
	
	@GetMapping("/show/{id}") 
    public String get_details(@PathVariable String id, Model model) {
		model.addAttribute("doctor", userRepository.findById((long) Integer.valueOf(id)));
	
        return "show";
    }
	
	@GetMapping("/table") 
    public String get_table(Model model) {
		model.addAttribute("doctors", userRepository.findAll());
        return "doctors";
    }
	
	@Transactional
	@GetMapping("/delete/{id}") 
    public String delete_item(@PathVariable String id,Model model) {
		userRepository.deleteById((long)Integer.valueOf(id));
        return "redirect:/table";
    }
	
	
	@GetMapping("/edit/{id}") 
    public String edit_item(@PathVariable String id,Model model) {
		model.addAttribute("add", userRepository.findById((long)Integer.valueOf(id)));
        return "register";
    }
	
}
