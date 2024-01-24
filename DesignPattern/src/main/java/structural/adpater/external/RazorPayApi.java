package structural.adpater.external;

public class RazorPayApi {

    public String makeLine(){
        return "RazorPay";
    }

    public void prePay(){
        System.out.println("Razor pay pre pay");
    }

    public void pay(String name,int amount){
        System.out.println("Razor payment "+amount);
    }

    public RazorPayStatus checkStatus(){
        return RazorPayStatus.PASS;
    }
}
