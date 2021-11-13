package io.spring.start.services;

import org.springframework.mail.SimpleMailMessage;

import io.spring.start.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}