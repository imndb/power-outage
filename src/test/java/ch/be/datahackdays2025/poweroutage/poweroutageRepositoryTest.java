package ch.be.datahackdays2025.poweroutage;

import ch.be.datahackdays2025.poweroutage.entity.FirstEntity;
import ch.be.datahackdays2025.poweroutage.repository.poweroutageRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
public class poweroutageRepositoryTest {

    @Autowired
    private poweroutageRepository repository;

    @Test
    public void testSavePowerOutage() {
        FirstEntity outage = new FirstEntity();
        outage.setLocation("Test Location");
        outage.setStatus("Active");
        FirstEntity savedOutage = repository.save(outage);

        assertThat(savedOutage.getId()).isNotNull();
    }
}