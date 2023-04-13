package br.edu.infnet.locadorademotos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LocadorademotosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocadorademotosApplication.class, args);
	}

}
