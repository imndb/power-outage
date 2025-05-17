package ch.be.datahackdays2025.poweroutage.config;

import ch.be.datahackdays2025.poweroutage.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
@Slf4j
public class EmailServiceMock implements EmailService {
    @Override
    public void sendEmail(String to, String text) {
        log.info("Email Sent to: " + to);
    }
}
