package ua.lviv.lgs;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@SpringBootApplication
public class DemoForHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoForHerokuApplication.class, args);
	}
	
	@Value("${cloudinary.url}")
	String cloudinaryUrl;
	
	
	@SuppressWarnings("unchecked")
	@Bean
	public Cloudinary cloudinary() throws IOException {
		System.out.println("Hello from cloudinary----------------------------------------");
		Cloudinary cloudinary = new Cloudinary(cloudinaryUrl);
		Map<String, String> uploadResult = cloudinary.uploader().upload("https://cloudinary-res.cloudinary.com/image/asset/dpr_2.0/logo-e0df892053afd966cc0bfe047ba93ca4.png", ObjectUtils.emptyMap());
		System.out.println(uploadResult.get("url"));
		return cloudinary;
	}
}