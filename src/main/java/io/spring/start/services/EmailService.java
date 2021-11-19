package io.spring.start.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import io.spring.start.domain.Cliente;
import io.spring.start.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg); // para envio de texto plano

	void sendNewPasswordEmail(Cliente cliente, String newPass);

}