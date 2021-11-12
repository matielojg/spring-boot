package io.spring.start.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import io.spring.start.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	/**
	 * integrar com gateway de pagamento no futuro
	 * @param pagto
	 * @param instanteDoPedido
	 */
	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(instanteDoPedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(cal.getTime());
	}
}
