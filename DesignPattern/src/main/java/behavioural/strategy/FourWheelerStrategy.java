package behavioural.strategy;
//step 2 create concrete strategy implemenation
public class FourWheelerStrategy implements NavigationStrategy{

    @Override
    public Double navigate(String from, String to) {
        System.out.println("four wheeler");
        return 4.0;
    }
}
