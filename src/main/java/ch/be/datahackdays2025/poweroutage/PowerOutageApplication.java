package ch.be.datahackdays2025.poweroutage;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "ch.be.datahackdays2025.poweroutage")
@ComponentScan(basePackages = "ch.be.datahackdays2025.poweroutage") // Explicitly scan the base package
@EntityScan("ch.be.datahackdays2025.poweroutage")
public class PowerOutageApplication {

	public static void main(String[] args) {

		SpringApplication.run(PowerOutageApplication.class, args);
	}

}
