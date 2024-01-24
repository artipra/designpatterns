package structural.adpater;

import structural.adpater.external.RazorPayApi;
import structural.adpater.external.RazorPayStatus;

// step 2 concrete adapters
public class RazorPayProvider implements PaymentPayProvider {

    private RazorPayApi razorPayApi = new RazorPayApi();
    @Override
    public String generateLink() {
       return razorPayApi.makeLine();
    }

    @Override
    public void pay(PaymentRequest paymentRequest) {
       razorPayApi.prePay();
       razorPayApi.pay(paymentRequest.getName(), paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus checkStatus() {
        RazorPayStatus status = razorPayApi.checkStatus();
        return toPaymentStatus(status);
    }

    private PaymentStatus toPaymentStatus(RazorPayStatus status){
         if(status == RazorPayStatus.PASS) return PaymentStatus.SUCCESS;
         return PaymentStatus.FAILURE;
    }

}
