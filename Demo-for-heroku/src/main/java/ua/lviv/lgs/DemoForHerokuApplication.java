package ua.lviv.lgs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cloudinary.Cloudinary;

@SpringBootApplication
public class DemoForHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoForHerokuApplication.class, args);
	}
	
	@Value("${cloudinary.url}")
	String cloudinaryUrl;
	
	
	@Bean
	public Cloudinary cloudinary() {
		return new Cloudinary(cloudinaryUrl);
	}
}