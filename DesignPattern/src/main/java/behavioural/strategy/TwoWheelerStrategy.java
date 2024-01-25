package behavioural.strategy;
//step 2 create concrete strategy implemenation
public class TwoWheelerStrategy implements NavigationStrategy{

    @Override
    public Double navigate(String from, String to) {
        System.out.println("from "+from +" to "+to);
        return 8.0;
    }
}
