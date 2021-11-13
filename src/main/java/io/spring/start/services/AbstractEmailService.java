package io.spring.start.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import io.spring.start.domain.Pedido;

public abstract class AbstractEmailService implements EmailService {

	@Value("${default.sender}")
	private String sender;

	/**
	 * Padrão de projeto Template Method é possivel implementar um metodo baseado em
	 * metodos abstratos que depois vão ser implementados pelas implementações da
	 * interface
	 */
	@Override
	public void sendOrderConfirmationEmail(Pedido obj) {
		SimpleMailMessage sm = prepareSimpleMailMessageFromPedido(obj);
		sendEmail(sm);
	}

	protected SimpleMailMessage prepareSimpleMailMessageFromPedido(Pedido obj) {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setTo(obj.getCliente().getEmail()); // Destinatário do Email
		sm.setFrom(sender); // Remetente
		sm.setSubject("Pedido confirmado! Código: " + obj.getId());// Assunto do Email
		sm.setSentDate(new Date(System.currentTimeMillis())); // Data do Email
		sm.setText(obj.toString()); // Corpo do Email
		return sm;
	}
}