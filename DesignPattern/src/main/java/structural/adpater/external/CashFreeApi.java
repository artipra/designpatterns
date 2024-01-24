package structural.adpater.external;

public class CashFreeApi {

    public String createURL()
    {
      return "Cashfree";
    }

    public void doPayment(int amount){
        System.out.println("Cash free payment "+amount);
    }

    public CashFreeStatus verifyStatus(){
        return CashFreeStatus.OK;
    }
}
