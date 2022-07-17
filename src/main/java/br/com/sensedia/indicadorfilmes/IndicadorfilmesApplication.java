package br.com.sensedia.indicadorfilmes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class IndicadorfilmesApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndicadorfilmesApplication.class, args);
	}

}
