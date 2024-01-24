package structural.adpater;

import structural.adpater.external.CashFreeApi;
import structural.adpater.external.CashFreeStatus;

public class CashFreePayProvider implements PaymentPayProvider {
    CashFreeApi cashFreeapi = new CashFreeApi();
    @Override
    public String generateLink() {
       return cashFreeapi.createURL();
    }

    @Override
    public void pay(PaymentRequest paymentRequest) {
        cashFreeapi.doPayment(paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus checkStatus() {
        CashFreeStatus status = cashFreeapi.verifyStatus();
        return toPaymentStatus(status);
    }

    private PaymentStatus toPaymentStatus(CashFreeStatus status){
      if(status == CashFreeStatus.OK) return PaymentStatus.SUCCESS;
      return PaymentStatus.FAILURE;
    }
}
