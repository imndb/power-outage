package ch.be.datahackdays2025.poweroutage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String to, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("Power Outage Notification");
        message.setText(text);
        message.setFrom("bespeil@gmail.com"); // TODO externalize
        mailSender.send(message);
    }
}