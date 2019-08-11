package com.FirstMVC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FirstController {
	@RequestMapping("/add")
	public void display() {
		
		System.out.println ("In control");
	}

}
