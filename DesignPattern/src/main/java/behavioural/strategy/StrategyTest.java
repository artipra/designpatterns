package behavioural.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        TwoWheelerStrategy two = new TwoWheelerStrategy();

        Navigator navigator = new Navigator(two);
        navigator.navigate("delhi","google");
    }
}
