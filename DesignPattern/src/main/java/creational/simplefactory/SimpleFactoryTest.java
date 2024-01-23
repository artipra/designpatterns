package creational.simplefactory;

public class SimpleFactoryTest {


    public static void main(String[] args) {
        Button round = ButtonFactory.createButton(ButtonType.ROUND,10,12,53);
        Button square = ButtonFactory.createButton(ButtonType.SQUARE,10,13,53);
    }
}
