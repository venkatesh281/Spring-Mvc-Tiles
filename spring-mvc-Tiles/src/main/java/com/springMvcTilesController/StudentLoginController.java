package com.springMvcTilesController;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentLoginController {
	
	@RequestMapping("/studentlogin")  
	public String loginPage(Model m) {
		
		m.addAttribute("student", new Student());
		return "login";
		
		
	}
	
	@RequestMapping("/loginagain")
	public String studentinfo(@Validated @ModelAttribute("student")Student stud, BindingResult rs) {
		
       if(rs.hasErrors()) {
    	   
    	   return "login";
       }
       else {
    	   
		return "viewpage";
       }
	}
	
	

}
