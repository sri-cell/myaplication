package com.odc.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*  It is a service class that provides the services to add a statement ,
 * remove statements, update statements , view statements.
 * 
 */


import com.odc.model.Payment;
import com.odc.service.PaymentDAOInterface;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class PaymentController {


	
	@Autowired
	public PaymentDAOInterface  paymentDAOInterface;
	
	
	
	
	/*  *Method                : addPayment
	 * Description             : To add the payment details to the data base.
	 * @RequestBody            : I maps the HttpRequest body to a transfer or domain object,
	 *                           enabling automatic deserialization of the inbound HttpRequest body onto a java Object.
	 * payment                 : payment details to be added to data base.
	 * return                  :payment
	 * 
	 */
	@PostMapping("/payments")
	public Payment addPayments(@RequestBody Payment payment) {
		 
		return paymentDAOInterface.addPayment(payment);
	}
	
	
	
	/*  *Method                : deletePayment
	 * Description             : To delete the payment details to the data base.
	 * @RequestBody            : I maps the HttpRequest body to a transfer or domain object,
	 *                           enabling automatic deserialization of the inbound HttpRequest body onto a java Object.
	 * payment                 : payment details to be deleted from data base.
	 * return                  :payment
	 * 
	 */
	
	
	@DeleteMapping("/payments/{id}")
    public Payment removePayment(@PathVariable long id) { 
        
    	return paymentDAOInterface.removePayment(id);
    	
    }
	
	
	/*  *Method                : getPaymentDetails
	 * Description             : To fetch the payment details from the data base.
	 * @RequestBody            : I maps the HttpRequest body to a transfer or domain object,
	 *                           enabling automatic deserialization of the inbound HttpRequest body onto a java Object.
	 * payment                 : payment details to be added to data base.
	 * return                  :payment
	 * 
	 */
    
    @GetMapping("/payments/{id}")
    public  Payment  getPaymentDetails(@PathVariable long id) {

          return paymentDAOInterface.getPaymentDetails(id);
    }
    
	/*  *Method                : getAllPayment
	 * Description             : To fetchAll  payment details from the data base.
	 * @RequestBody            : I maps the HttpRequest body to a transfer or domain object,
	 *                           enabling automatic deserialization of the inbound HttpRequest body onto a java Object.
	 * payment                 : payment details to be added to data base.
	 * return                  :payment
	 * 
	 */
    
    @GetMapping("/payments")
    public List<Payment> getAllPayment(){

    	return paymentDAOInterface.getAllPaymentDetails();
    	
    }
    
    
	/*  *Method                : updatePayment
	 * Description             : To update the payment details to the data base.
	 * @RequestBody            : I maps the HttpRequest body to a transfer or domain object,
	 *                           enabling automatic deserialization of the inbound HttpRequest body onto a java Object.
	 * payment                 : payment details to be updated to data base.
	 * return                  :payment
	 * 
	 */
    @PutMapping("/payments")
	public Payment updatePayment( @RequestBody Payment payment) {

     Payment payment1 = paymentDAOInterface.updatePayment( payment);
     return payment1;
	}
    
    
    
    
    
    
}
