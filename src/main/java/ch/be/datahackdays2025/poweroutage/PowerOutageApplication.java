package ch.be.datahackdays2025.poweroutage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PowerOutageApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerOutageApplication.class, args);
	}

}
