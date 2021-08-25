package com.odc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.odc.model.Card;
import com.odc.model.Payment;
import com.odc.repository.PaymentRepository;
import com.odc.service.PaymentDAO;
@SpringBootTest
class PaymentServiceTest {

	@Autowired
	PaymentDAO paymentDAO;
	
	@Autowired
	PaymentRepository paymentRepository;
	
	
	
	@Test
	void testAddPayment() {
		//fail("Not yet implemented");
		
		Card c = new Card();
		c.setCardName("GOUSE");
		c.setCardNumber("1102476005");
		c.setCvv(223);
		c.setCardExpiry(LocalDate.of(2024,12,8));
		
		Payment p = new Payment();
		p.setPaymentId(460);
		p.setType("card");
		p.setStatus("completed");
		p.setCard(c);
		
		paymentRepository.save(p);
		assertThat(p.equals(paymentDAO.addPayment(p)));
		
	
		
	}

	@Test
	void testRemovePayment() {
		//fail("Not yet implemented");
		
		Card c = new Card();
		c.setCardName("GOUSE");
		c.setCardNumber("1102476005");
		c.setCvv(223);
		c.setCardExpiry(LocalDate.of(2024,12,8));
		
		Payment p = new Payment();
		p.setPaymentId(460);
		p.setType("card");
		p.setStatus("completed");
		p.setCard(c);
		paymentRepository.save(p);
		paymentRepository.findById(460L);
		
		Payment pp = paymentDAO.removePayment(460L);
		
		assertFalse(p.equals(pp));
		
		
		
	}

	@Test
	void testUpdatePayment() {
		//fail("Not yet implemented");
		Card c = new Card();
		c.setCardName("GOUSE");
		c.setCardNumber("1102476005");
		c.setCvv(223);
		c.setCardExpiry(LocalDate.of(2024,12,8));
		
		Payment p = new Payment();
		p.setPaymentId(460);
		p.setType("card");
		p.setStatus("completed");
		p.setCard(c);
		paymentRepository.save(p);
		paymentRepository.findById(460L);
		
		p.setType("creadit card");
		paymentRepository.save(p);
		
		assertThat(p.equals(paymentDAO.updatePayment(p)));
		
		
	}

	@Test
	void testGetPaymentDetails() {
		//fail("Not yet implemented");
		
		Card c = new Card();
		c.setCardName("GOUSE");
		c.setCardNumber("1102476005");
		c.setCvv(223);
		c.setCardExpiry(LocalDate.of(2024,12,8));
		
		Payment p = new Payment();
		p.setPaymentId(460);
		p.setType("card");
		p.setStatus("completed");
		p.setCard(c);
		paymentRepository.save(p);
		
		Payment payment = new Payment();
		 payment = paymentDAO.getPaymentDetails(460);
		 assertThat(p.equals(payment));

		
	}

	@Test
	void testGetAllPaymentDetails() {
		//fail("Not yet implemented");
		
		Card c = new Card();
		c.setCardName("GOUSE");
		c.setCardNumber("1102476005");
		c.setCvv(223);
		c.setCardExpiry(LocalDate.of(2024,12,8));
		
		Payment p = new Payment();
		p.setPaymentId(460);
		p.setType("card");
		p.setStatus("completed");
		p.setCard(c);
		//paymentRepository.save(p);
		
		List<Payment> list = new ArrayList<>();
		list.add(p);
		paymentRepository.save(p);
		assertThat(list.equals(paymentDAO.getAllPaymentDetails()));
		
	}

}
