package ch.be.datahackdays2025.poweroutage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan
@EntityScan
public class PowerOutageApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerOutageApplication.class, args);
	}
}