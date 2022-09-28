package br.com.xmob.clientepet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/")
@RestController
@SpringBootApplication
public class ClientePetApplication {
	@GetMapping()
	public String getJavaHome() {
		return "JavaHome";
	}
	public static void main(String[] args) {
		SpringApplication.run(ClientePetApplication.class, args);
	}

}
