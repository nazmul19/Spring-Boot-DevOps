/**
 * 
 */
package edu.explore.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nazmul.Hassan
 *
 */
@RestController
@EnableAutoConfiguration
public class Application {
	
	@RequestMapping("")
	public String home(){
		return "SpringBoot Provide DevOps out of the box. Try Below End Points.";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}
}
