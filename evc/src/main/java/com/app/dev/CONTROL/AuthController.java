package com.app.dev.CONTROL;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")*/
public class AuthController {
	@GetMapping(path = "/auth")
	public String basicauth() {
		return  null ;
	}
}
