package structural.adpater;
//step 1  create common adapter interface
public interface PaymentPayProvider {

 public String generateLink();

 public void pay(PaymentRequest paymentRequest);

 public PaymentStatus checkStatus();


}
