package io.springofficehours.service.webinar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

@Controller
class ImageController {

	@GetMapping("/")
	public String index() {
		return "forward:/image.png";
	}
}
