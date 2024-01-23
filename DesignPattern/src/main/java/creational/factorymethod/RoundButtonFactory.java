package creational.factorymethod;

import creational.simplefactory.Button;
import creational.simplefactory.RoundButton;
import creational.simplefactory.SquareButton;

public class RoundButtonFactory implements ButtonFactory {

    public Button createButton(double border, double radius,double length) {
         return new RoundButton(border, border);
    }

}
