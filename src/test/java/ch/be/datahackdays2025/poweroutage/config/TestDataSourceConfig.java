package ch.be.datahackdays2025.poweroutage.config;


// TestDataSourceConfig.java

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@TestConfiguration
@Profile("test")
public class TestDataSourceConfig {

    @Bean
    @Primary
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:h2:mem:testdb")
                .username("sa")
                .password("")
                .driverClassName("org.h2.Driver")
                .build();
    }
}