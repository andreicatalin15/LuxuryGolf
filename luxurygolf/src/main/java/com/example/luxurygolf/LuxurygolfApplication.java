package com.example.luxurygolf;

import com.example.luxurygolf.domain.User;
import com.example.luxurygolf.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LuxurygolfApplication {

	public static void main(String[] args)
	{
		ApplicationContext ctx = SpringApplication.run(LuxurygolfApplication.class, args);
		UserService userService = ctx.getBean(UserService.class);
		PasswordEncoder crypt = new BCryptPasswordEncoder();
		User u1 = new User("DOO DOO","doodoo","doodoo@yahoo.com",crypt.encode("doodoo"));
		System.out.println("Users available: " + u1);
		userService.save(u1);

	}

}
